package Test3;

public class Main extends Thread
{
    //可以看到线程的交替执行
    @Override
    public void run()
    {
        for(int i = 0;i < 10000;i++)
        {
            System.out.println("hello world-"+i);
        }
    }

    public static void main(String[] args)
    {
        //main主线程
        Main thread1 = new Main();
        //创建线程对象
        thread1.start();
        //启动线程,不一定马上执行

        for(int i = 0;i < 10000;i++)
        {
            System.out.println("hello-"+i);
        }
    }
}
