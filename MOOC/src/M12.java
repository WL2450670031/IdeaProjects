import java.util.Scanner;

/*
动态规划
数字三角形最大路径
吴乐 汉江师范学院 软件工程
2022.2.11
2022.2.11
 */
public class M12
{
    static final int MAX = 101;
    static int[][] D = new int[MAX][MAX];//存放三角形
    static int[][] max = new int[MAX][MAX];//记录结果
    static int n;//三角形行数

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i;
        int j;

        System.out.println("请输入三角形行数:");
        n = in.nextInt();

        System.out.println("请输入三角形:");
        for(i = 0;i < n;i++)
        {
            System.out.println("第"+(i+1)+"行:");
            for(j = 0;j <= i;j++)
            {
                D[i][j] = in.nextInt();
                max[i][j] = -1;
            }
        }

        in.close();

        for(i = 0;i < n;i++)
        {
            for(j = 0;j <= i;j++)
            {
                System.out.print(D[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(maxSum(0,0));
    }

    public static int maxSum(int i,int j)
    {
        if(max[i][j] != -1)
        {
            return max[i][j];
        }
        if(i == n)
        {
            max[i][j] = D[i][j];
        }
        else
        {
            max[i][j] = Math.max(maxSum(i+1,j+1),maxSum(i+1,j))+D[i][j];
        }

        return max[i][j];
    }
}
