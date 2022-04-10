import java.util.Scanner;
//吴乐 汉江师范学院 软件工程
//begin     2022.1.22 17:48
//happyend  2022.1.22 17:53
//上台阶

public class M6
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(stairs(n));
    }
    public static int stairs(int n)
    {
        if(n < 0)
            return 0;
        else if(n == 0)
            return 1;
        else
            return stairs(n-1)+stairs(n-2);
    }
}
