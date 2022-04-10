package Demo;

public class Demo1
{
    public static void main(String[] args)
    {
        int n=1;//现在你有n+1个女朋友。
        for(int i = 0;i<=n;i++)
        {
            System.out.println("女:你有没有女朋友\n");
            if(i==0)
                System.out.println("男:没有啊\n");
            else
                System.out.println("男:有"+i+"个\n");
            System.out.println("女:好啊，你现在有"+(i+1)+"个啦\n");
            if(i!=n)
                System.out.println("男:等等，你再问一遍\n");
        }
    }
}