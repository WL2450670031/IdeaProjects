package S3;

import java.util.Scanner;

/*
* �������� 1, 1, 1, 3, 5, 9, 17,....�ӵ� 4 �ʼ��ÿ���ǰ3��ĺ͡�

��� 20190324 ������4λ���֡�
* */
public class Main
{
    public static void main(String[] args)
    {
            int a = 1,b = 1,c = 1,d = 0;
            for(int i = 4;i<=50;i++){
                d = (a+b+c)%10000;
                a = b;
                b = c;
                c = d;
                System.out.println(a+" "+b+" "+c);
                System.out.println(a+b+c);
            }
            System.out.println(d);
        }
}
