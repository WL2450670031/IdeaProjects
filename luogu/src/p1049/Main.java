package p1049;

import java.util.Scanner;

//动态规划
/*
* 有一个箱子容量为V（正整数 0≤V≤20000），同时有n个物品（0<n≤30，每个物品有一个体积（正整数）。
要求n个物品中，任取若干个装入箱内，使箱子的剩余空间为最小。
* 输出剩余容积*/
public class Main
{
    public static void main(String[] args)
    {
        int V;//箱子容量
        int n;//物品数量
        int[] nv = new int[31];//物品容积
        int[][] dp = new int[31][20001];

        Scanner in = new Scanner(System.in);

        V = in.nextInt();
        n = in.nextInt();


        for(int j = 0;j < 20001;j++)
        {
            dp[0][j] = 0;
        }

        for(int i = 1;i <= n;i++)//输入每个物品的体积。
        {
            nv[i] = in.nextInt();
        }
        in.close();

        for(int i = 1;i <= n;i++)//从1个物品算起
        {
            for(int j = 1;j <= V;j++)//从1体积算起
            {
                if(j >= nv[i])
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-nv[i]]+nv[i]);
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println(V-dp[n][V]);
    }

}
