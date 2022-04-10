package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class A
{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println(Arrays.toString(toBinaryArray(1000)));
    }

    public static int[] toBinaryArray(int num)
    {
        int x=1;
        int[] binary=new int[10];
        for(int i=0;i<10;i++)
        {
            if(((num>>i)&x)==1)
                binary[9-i]=1;
            else if(((num>>i)&x)==0)
                binary[9-i]=0;
        }
        return binary;
    }
}
