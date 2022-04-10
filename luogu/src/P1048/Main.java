package P1048;

import java.util.Scanner;

//01背包
/*
采药
*/
public class Main
{
    public static void main(String[] args)
    {
        int t;//时间 1<=1000
        int m;//数目 1<=100
        int[][] M = new int[101][2];//时间，价值
        int[][] dp = new int[105][1005];

        Scanner in = new Scanner(System.in);

        System.out.print("输入时间:");
        t = in.nextInt();
        System.out.print("输入数目:");
        m = in.nextInt();

        M[0][0] = 0;
        M[0][1] = 0;

        for(int i = 1;i <= m;i++)
        {
            System.out.print("第" + i +"种");
            M[i][0] = in.nextInt();//输入草药的时间
            M[i][1] = in.nextInt();//输入草药的价值
        }

        for(int i = 1;i <= m;i++)//从0到m开始算
        {
            for(int j = t;j >= 0;j--)
            {
                if(j >= M[i][0])//当前时间够
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-M[i][0]] + M[i][1]);
                }//选择拿药还是不拿
                else//时间不够
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.print(dp[m][t]);
    }
}
