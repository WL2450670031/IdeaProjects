package S3;

import java.util.Scanner;

//动态规划
/*
给出了一个数字三角形。从三角形的顶部到底部有很多条不同的路径。对于每条路径，
把路径上面的数加起来可以得到一个和，你的任务就是找到最大的和。
路径上的每一步只能从一个数走到下一层和它最近的左边的那个数或者右 边的那个数。
此外，向左下走的次数与向右下走的次数相差不能超过 1
dp={
   {
 */
public class Main12
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] n = new int[num][num];
        for(int i = 0;i < num;i++)
        {
            for(int j = 0;j <= i;j++)
            {
                n[i][j] = in.nextInt();
            }
        }
        System.out.println(dp(num,n));
    }

    public static int dp(int num,int[][] n)
    {
        int a;

        return a;
    }
}


