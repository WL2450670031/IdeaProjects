/*
���� ����ʦ��ѧԺ �������
begin     2022.1.22 18:20
happyend  2022.1.22 18:32
*/

import java.util.Scanner;

//��ƻ��
public class M7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();//ƻ����
        int n = in.nextInt();//������
        System.out.println(apple(m,n));
    }

    public static int apple(int m,int n)
    {
        if(m == 0)
        {
            return 1;
        }
        if(n == 0)
        {
            return 0;
        }
        if(m < n)//���ƻ����������
            return apple(m,m);
        return apple(m,n-1)+apple(m-n,n);
        //���ƻ�������Ӷ࣬��ô�ܷŷ����������ӿյķ���+û�����ӿյķŷ�
    }
}
