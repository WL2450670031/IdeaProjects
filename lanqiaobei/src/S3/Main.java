package S3;

import java.util.Scanner;

/*
* 给定数列 1, 1, 1, 3, 5, 9, 17,....从第 4 项开始，每项都是前3项的和。

求第 20190324 项的最后4位数字。
* */
public class Main
{
    public static void main(String[] args)
    {
            int a = 1,b = 1,c = 1,d = 0;
            for(int i = 4;i<=50;i++){
                d = (a+b+c)%10000;
                a = b;
                b = c;
                c = d;
                System.out.println(a+" "+b+" "+c);
                System.out.println(a+b+c);
            }
            System.out.println(d);
        }
}
