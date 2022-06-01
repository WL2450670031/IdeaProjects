package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args)
    {
        //1.创建线程池，
        //newFixedThreadPool，参数为线程池大小
        ExecutorService service = Executors.newFixedThreadPool(4);

        //2.执行线程(Runnable接口)
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

        //3.关闭线程池
        service.shutdown();
    }
}

class MyThread implements Runnable
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}