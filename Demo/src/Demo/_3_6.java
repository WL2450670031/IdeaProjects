package Demo;

import java.util.Scanner;
import static java.util.Arrays.sort;
//输入数组，快速排序
public class _3_6
{
    public static void main(String[] args)
    {
        int[] a=new int[10];
        Scanner scn=new Scanner(System.in);
        System.out.println("请输入一个数组：");
        for(int i=0;i<10;i++)
        {
            a[i]=scn.nextInt();
        }
        sort(a);//官方快速排序，需导入。
        System.out.println("排序后数组为：");
        for(int b:a)//for each语法。
            System.out.print(b+" ");
    }
}
