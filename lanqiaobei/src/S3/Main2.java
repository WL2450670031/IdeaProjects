package S3;
/*
* 把 2019 分解成 3 个各不相同的正整数之和，
* 并且要求每个正整数都不包含数字 2 和 4，一共有多少种不同的分解方法？
*/
public class Main2
{
    public static void main(String[] args)
    {
        int num = 0;
        for(int i = 1;i < 2019;i++)//第1个数
        {
            if(have2or4(i))
                continue;
            for(int j = i+1;j < 2019;j++)//第2个数
            {
               if(have2or4(j) )
                   continue;
               for(int k = j+1;k <2019;k++)
               {
                   if (have2or4(k))
                       continue;
                   if (i + j + k == 2019)
                       num++;
               }
            }
        }
        System.out.println(num);
    }

    public static boolean have2or4(int n)
    {
        while(n!=0)
        {
            if(n%10==2||n%10==4)
                return true;
            n/=10;
        }
        return false;
    }
}
