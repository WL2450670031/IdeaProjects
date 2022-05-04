package D_1084;

import java.util.Scanner;

//用筛法求之N内的素数。
//begin     2022.1.19 16:38
//happyend  2022.1.19 16：55

public class d1084
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 2;i <= n;i++)
        {
            boolean a = true;
            for(int j = 2;j < i;j++)
            {
                if (i % j == 0)
                {
                    a = false;
                    break;
                }
            }
            if(a)
                System.out.println(i);
        }
    }
}
