package 龟兔赛跑;

public class Race implements Runnable
{
    private static String winner;
    public void run()
    {
        for(int i = 1;i <= 100;i++)
        {
            if(Thread.currentThread().getName().equals("兔子") && i%50 == 0)
            {
                try
                {
                    Thread.sleep(10);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            boolean b = over(i);
            if (b)
            {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
    }

    private boolean over(int steps)
    {
        if(winner != null)
        {
            return true;
        }
        else
        {
            if (steps >= 100
            ) {

                winner = Thread.currentThread().getName();
                System.out.println("winner is" + winner);
                return true;
            }
        }
        return false;
    }
}
