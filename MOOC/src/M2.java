import java.util.Scanner;

//Çó½×³Ë
public class M2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fac(n));
    }
    public static int fac(int n)
    {
        if(n == 0)
            return 1;
        else
            return n*fac(n-1);
    }
}
