package cla;/*ְԱ�������������䣬�Ա���ʾ��Ϣ*/

import java.util.Scanner;

public class Hotel
{
    public static void main(String[] args)
    {
        Peoples peoples=new Peoples();
        Scanner scn=new Scanner(System.in);
        int j=0;
        int i;
        do {
            System.out.println("\n***��Ϣ����***");
            System.out.println("1.��Ϣ¼��\n2.��Ϣ��ѯ\n3.�˳�");
            System.out.println("�������ţ�");
            i = scn.nextInt();
            switch (i) {
                case 1:
                    j = peoples.input();
                    break;
                case 2:
                    peoples.print(j);
                    break;
                case 3:
                    System.out.println("�˳�");
            }
        }while(i!=3);
    }
}


