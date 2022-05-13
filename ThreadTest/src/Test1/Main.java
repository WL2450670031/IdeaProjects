package Test1;

/**
 * @author 吴乐
 */
public class Main extends Thread
{
    public int count = 10;
    @Override
    public void run()
    {
        long a = System.currentTimeMillis();
        while(count > 0)
        {
            System.out.print(count+" ");
            count--;
        }
        long b = System.currentTimeMillis();
        System.out.println(b-a + "ms");
    }

    public static void main(String[] args)
    {
        new Main().start();
    }
}
