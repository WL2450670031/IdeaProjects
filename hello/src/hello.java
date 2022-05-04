import java.util.Scanner;

public class hello
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int year=scn.nextInt();
        if(year%4==0&&year%100!=0||year%400==0)
            System.out.println(year+"是闰年。");
        else
            System.out.println(year+"不是闰年。");
    }
}