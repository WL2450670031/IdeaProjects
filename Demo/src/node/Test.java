package node;
//单链表
//吴乐，汉江师范学院，2021.12.7

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        LinkList<String> linkList = new LinkList<String>();
        Scanner scn=new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            linkList.add(scn.next(),i+1);
        }
        if(linkList.isEmpty())
            System.out.println("null");
        else
        {
            System.out.println("notnull");
        }
    }
}
