/**
 * @author 吴乐
 */
public class hello
{
    public static void main(String[] args)
    {
        long begin = System.currentTimeMillis();

        System.out.println("hello world!");
        System.out.println("hello java!");
        System.out.println("我是吴乐。");
        for(int i = 0;i < 10000000;i++)
        {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        long time = end - begin ;
        System.out.println(time +"ms");
    }
}