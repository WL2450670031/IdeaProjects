package hotel;

import java.util.Scanner;

/*
��3��¥��ÿ��¥6�����䣻
Ҫ��
1.printOtherRoom,������з�����Ϣ���������ס���ͰѸ�����Ϣһ�������
2.printOneRoom���������������Ϣ���������ס���ͰѸ�����Ϣһ�������
3.��ס��getRoom���˷���outRoom��
4.getClientInformation,��ס��������ͻ�������Ϣ���˷�ʱ�������Ϣ��
5.��������ƣ��������Ҫ��error��ʾ��
6.ʹ����������̷�����
 */
public class HotelSystem
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        Hotel hotel=new Hotel();
        int num;
        do{
            System.out.println("***�м��ջ***");
            System.out.println("1.ס��\n2.�˷�\n3.����\n4.�鿴\n5.�˳�\n����:");
            num=scn.nextInt();
            switch(num)
            {
                case 1:{
                    System.out.println("����:");
                    int i=scn.nextInt();
                    hotel.getRoom(i);
                    break;
                }
                case 2:{
                    System.out.println("����:");
                    int i=scn.nextInt();
                    hotel.outRoom(i);
                    break;
                }
                case 3:{
                    System.out.println("***��ջ��ͼ***");
                    hotel.printOtherRoom();
                    break;
                }
                case 4:{
                    System.out.print("����:");
                    int i=scn.nextInt();
                    hotel.printOneRoom(i);
                    break;
                }
                case 5:{
                    System.out.print("�˳�");
                    break;
                }
                default:System.out.print("�������");
            }
        }while(num!=5);
    }
}
