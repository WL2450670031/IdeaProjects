package Demo;

import java.util.Scanner;
import static java.util.Arrays.sort;
//�������飬��������
public class _3_6
{
    public static void main(String[] args)
    {
        int[] a=new int[10];
        Scanner scn=new Scanner(System.in);
        System.out.println("������һ�����飺");
        for(int i=0;i<10;i++)
        {
            a[i]=scn.nextInt();
        }
        sort(a);//�ٷ����������赼�롣
        System.out.println("���������Ϊ��");
        for(int b:a)//for each�﷨��
            System.out.print(b+" ");
    }
}
