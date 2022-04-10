package B_10;
//十进制转十六进制
//begin     2022.1.15 13:16
//happyend  2022.1.16 15:23

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        String b = "";
        while(a > 16)
        {
            switch(Math.toIntExact(a % 16))
            {
                case 10:b = b.concat("A");break;
                case 11:b = b.concat("B");break;
                case 12:b = b.concat("C");break;
                case 13:b = b.concat("D");break;
                case 14:b = b.concat("E");break;
                case 15:b = b.concat("F");break;
                default :
                    String c = String.valueOf(a%16);
                    b = b.concat(c);
            }
            a = a/16;
        }
        b = b.concat(String.valueOf(a));
        char[] C = b.toCharArray();
        for(int i = C.length-1;i >= 0;i--)
        {
            System.out.print(C[i]);
        }
    }
}
