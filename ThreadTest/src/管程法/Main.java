package 管程法;

public class Main
{
    public static void main(String[] args)
    {
        Buf container = new Buf();

        new Pro(container).start();
        new Shopper(container).start();
    }
}

//生产者
class Pro extends Thread
{
     Buf container;

     public Pro(Buf container)
     {
         this.container = container;//设立缓冲区
     }

     @Override
     public void run()
     {
         for(int i = 0;i < 100;i++)
         {
             container.push(new Chi(i));
         }
     }
}


//消费者
class Shopper extends Thread
{
    Buf container;

    public Shopper(Buf container)
    {
        this.container = container;//设立缓冲区
    }

    @Override
    public void run()
    {
        for(int j = 0;j < 100;j++)
        {
            container.shop();
        }
    }

}
//产品
class Chi
{
    int id;
    public Chi(int id)
    {
        this.id = id;
    }

    @Override
    public String toString() {
        return id+"";
    }
}
//缓冲区
class Buf
{
    Chi[] chis = new Chi[60];
    //容器大小
    int count = 0;

    public synchronized void push(Chi chi)
    {
        while(count == 10)
        {
           try
           {
               this.wait();
           } catch (InterruptedException e)
           {
               e.printStackTrace();
           }

        }

        chis[count] = chi;
        System.out.println("生产了第"+count+"只鸡。");
        count++;
        //通知消费者消费，生产者等待
        this.notifyAll();
    }

    public synchronized void shop()
    {
        while(count == 0)
        {
            try
            {
                this.wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            //等待生产者生产，等待消费
        }
        count--;
        System.out.println("消费了第-->"+count+"只鸡。");

        this.notifyAll();
    }
}