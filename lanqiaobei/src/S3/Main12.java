package S3;

import java.util.Scanner;

//��̬�滮
/*
������һ�����������Ρ��������εĶ������ײ��кܶ�����ͬ��·��������ÿ��·����
��·������������������Եõ�һ���ͣ������������ҵ����ĺ͡�
·���ϵ�ÿһ��ֻ�ܴ�һ�����ߵ���һ������������ߵ��Ǹ��������� �ߵ��Ǹ�����
���⣬�������ߵĴ������������ߵĴ������ܳ��� 1
dp={
   {
 */
public class Main12
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] n = new int[num][num];
        for(int i = 0;i < num;i++)
        {
            for(int j = 0;j <= i;j++)
            {
                n[i][j] = in.nextInt();
            }
        }
        System.out.println(dp(num,n));
    }

    public static int dp(int num,int[][] n)
    {
        int a;

        return a;
    }
}


