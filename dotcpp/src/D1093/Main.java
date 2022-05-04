package D1093;

import java.util.Scanner;

// ×Ö·ûÄæÐò
//begin    2022.1.19 17:10
//happyend 2022.1.19 17:12
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] c = s.toCharArray();
        for(int i = c.length-1;i >=0 ;i--)
        {
            System.out.print(c[i]);
        }
    }
}
