/*
吴乐 汉江师范学院 软件工程
begin     2022.1.22 18:20
happyend  2022.1.22 18:32
*/

import java.util.Scanner;

//放苹果
public class M7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();//苹果数
        int n = in.nextInt();//盘子数
        System.out.println(apple(m,n));
    }

    public static int apple(int m,int n)
    {
        if(m == 0)
        {
            return 1;
        }
        if(n == 0)
        {
            return 0;
        }
        if(m < n)//如果苹果比盘子少
            return apple(m,m);
        return apple(m,n-1)+apple(m-n,n);
        //如果苹果比盘子多，那么总放法等于有盘子空的方法+没有盘子空的放法
    }
}
