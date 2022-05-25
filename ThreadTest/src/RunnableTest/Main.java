package RunnableTest;

public class Main implements Runnable
{

    @Override
    public void run()
    {
        for(int i = 0;i < 10000;i++)
        {
            System.out.println("hello"+i);
        }
    }

    public static void main(String[] args)
    {
        Main main = new Main();

        Thread thread = new Thread(main);
        thread.start();

        //new Thread(new Main()).start();

        for(int i = 0;i < 10000;i++)
        {
            System.out.println("world"+i);
        }
    }
}
