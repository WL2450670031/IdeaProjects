package Lock锁;

import java.util.concurrent.locks.ReentrantLock;

//测试Lock锁
public class Lock
{
    public static void main(String[] args)
    {
        Test test = new Test();

        new Thread(test).start();
        new Thread(test).start();
        new Thread(test).start();
    }
}
class Test implements Runnable
{
    int ticketNums = 10;

    private final ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                reentrantLock.lock();
                //定义lock锁
                if (ticketNums > 0)
                {
                    try
                    {
                        Thread.sleep(1000);

                    } catch (InterruptedException e)
                    {
                        throw new RuntimeException(e);
                    }
                }
                else
                {
                    break;
                }
            }finally
            {
                reentrantLock.unlock();
                //解锁
            }

            System.out.println(ticketNums--);

        }
    }
}