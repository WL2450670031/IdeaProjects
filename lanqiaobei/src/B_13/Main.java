package B_13;
//数组排序
//begin    2022.1.14 16:50
//happyend 2022.1.14 17:00
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int[] S = new int[num];

        for(int i = 0;i< num;i++)
        {
            S[i] = in.nextInt();
        }
        for(int i = 0;i < num;i++)
        {
            for(int j = 0;j < num-1;j++)
            {
                if(S[j] > S[j+1])
                {
                    int naka = S[j];
                    S[j] = S[j+1];
                    S[j+1] = naka;
                }
            }
        }
        for(int a:S)
            System.out.print(a+ " ");
    }
}
