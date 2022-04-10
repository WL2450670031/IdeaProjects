package hotel;

import java.util.Scanner;

/*
有3层楼，每层楼6个房间；
要求：
1.printOtherRoom,输出所有房间信息，如果有人住，就把个人信息一起输出。
2.printOneRoom，输出单个房间信息，如果有人住，就把个人信息一起输出。
3.入住：getRoom；退房：outRoom。
4.getClientInformation,入住必须输入客户个人信息。退房时，清除信息。
5.有输入控制，输入错误要有error提示。
6.使用面向对象编程方法。
 */
public class HotelSystem
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        Hotel hotel=new Hotel();
        int num;
        do{
            System.out.println("***有间客栈***");
            System.out.println("1.住房\n2.退房\n3.总览\n4.查看\n5.退出\n操作:");
            num=scn.nextInt();
            switch(num)
            {
                case 1:{
                    System.out.println("房号:");
                    int i=scn.nextInt();
                    hotel.getRoom(i);
                    break;
                }
                case 2:{
                    System.out.println("房号:");
                    int i=scn.nextInt();
                    hotel.outRoom(i);
                    break;
                }
                case 3:{
                    System.out.println("***客栈总图***");
                    hotel.printOtherRoom();
                    break;
                }
                case 4:{
                    System.out.print("房号:");
                    int i=scn.nextInt();
                    hotel.printOneRoom(i);
                    break;
                }
                case 5:{
                    System.out.print("退出");
                    break;
                }
                default:System.out.print("输入错误");
            }
        }while(num!=5);
    }
}
