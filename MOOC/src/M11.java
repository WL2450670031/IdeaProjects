/*
����
���� ����ʦ��ѧԺ �������
2022.2.9 17:42
2022.2.9 18:00
����ʮ���첻ѧϰ������ҹߣ������Ϸ��������������ȥ�ˣ�
 */

import java.util.Scanner;

public class M11
{
    static final int ARRAY_SIZE = 10;
    static int[] a = new int[ARRAY_SIZE];

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        for(int i = 0;i < ARRAY_SIZE;i++)
        {
            a[i] = in.nextInt();
        }
        quickSort(a,0,9);
        for(int b:a)
            System.out.print(b+" ");
    }

    public static void quickSort(int[] a,int s,int e)
    {
        if(s >= e)
            return;
        int k = a[s];
        int i = s;
        int j = e;
        while(i != j)
        {
            while(i<j && a[j]>=k)//����kС��ֵ��k��λ��
                j--;
            swap(i,j);
            while(i<j && a[i]<=k)//����k���ֵ��k��λ��
                i++;
            swap(i,j);
        }//������a[i]=k;
        quickSort(a,s,i-1);
        quickSort(a,i+1,e);
    }
    public static void swap(int i,int j)
    {
        int m = a[i];
        a[i] = a[j];
        a[j] = m;
    }
}
