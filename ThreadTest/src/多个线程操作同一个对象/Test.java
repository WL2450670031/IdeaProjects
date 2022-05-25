package 多个线程操作同一个对象;

public class Test implements Runnable
{
    private int ticketNum = 10;

    public void run()
    {
        while (ticketNum > 0)
        {
            System.out.println(Thread.currentThread().getName() + "拿到了第" + ticketNum-- + "张票");
        }
    }
}
