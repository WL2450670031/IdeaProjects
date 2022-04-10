import java.util.Scanner;

//n皇后问题
public class M4
{
    static int N = 20;//最大皇后数目
    static int[] q = new int[21];//各个皇后所在的行号
    static int cont = 0;//结果个数

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入皇后个数:");
        int n = in.nextInt();
        if(n > N || n < 1)
        {
            System.out.println("输入错误");
        }
        else if(n == 2 || n == 3)
        {
            System.out.println("无解");
        }
        else
        {
            place(1,n);
        }

    }
    public static void print(int n)
    {
        cont++;

        System.out.print("第"+cont+"个解为:");
        for(int i = 1;i <=n;i++)
        {
            System.out.printf("(%d,%d)",i,q[i]);
        }
        System.out.println();
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= n;j++)
            {
                if(q[i]!=j)
                    System.out.print("x ");
                else
                    System.out.print("O ");
            }
            System.out.println();
        }
    }
    //检验第i行第k列是否可以摆放皇后
    public static boolean find(int i,int k)
    {
        int j = 1;
        while(j < i)//j = 1~i-1，是已经放置了皇后的行
        {
            if(q[j] == k || Math.abs(j-i) == Math.abs(q[j] - k))
                //检测当前位置是否处于其他皇后的下面或斜线上
                return false;
            j++;
        }
        return true;
    }

    public static void place(int k,int n)//在第k行放置放置皇后
    {
        if(k > n)//放完后输出结果
            print(n);
        else
        {
            for(int i = 1;i <= n;i++)
            {
                if(find(k,i))
                {
                    q[k] = i;//在第k行第i列放置皇后
                    place(k+1,n);
                }
            }
        }
    }
}