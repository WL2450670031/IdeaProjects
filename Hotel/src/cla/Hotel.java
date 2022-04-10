package cla;/*职员，有姓名，年龄，性别。显示信息*/

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
            System.out.println("\n***信息管理***");
            System.out.println("1.信息录入\n2.信息查询\n3.退出");
            System.out.println("请输入编号：");
            i = scn.nextInt();
            switch (i) {
                case 1:
                    j = peoples.input();
                    break;
                case 2:
                    peoples.print(j);
                    break;
                case 3:
                    System.out.println("退出");
            }
        }while(i!=3);
    }
}


