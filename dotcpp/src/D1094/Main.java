package D1094;

import java.util.Scanner;

//字符串的输入输出处理
//begin
//happyend
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println();
        for(int i = 0;i <= n;i++)
        {
            String s = in.nextLine();
            System.out.println(s+"\n");
        }
        while(in.hasNextLine())
        {
            String s = in.nextLine();
            String[] a = s.split(" ");
            for (String value : a) {
                System.out.println(value + "\n");
            }
        }
    }
}
