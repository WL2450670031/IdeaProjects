package p1734;

import java.util.Scanner;
//选取和不超过S的若干个不同的正整数，使得所有数的约数（不含它本身）之和最大。
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int S;
        int[] a = new int[1001];
        int[] dp = new int[1001];

        S = in.nextInt();
        in.close();

        for(int i = 1;i <= S;i++)//预处理约数和
        {
            for (int j = 2; j * i <= S; j++)
            {
                a[i * j] += i;
            }
        }
        for (int b : a)
        {
            System.out.println(b);
        }
    }

   //public static int num(int x)
    {

    }
}
