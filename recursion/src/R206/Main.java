package R206;

import LinkedList.Linked_List;
import LinkedList.Linked_Node;
import R203.Recursion_delete;

import java.util.Scanner;

//给单链表的头节点 head ，反转链表，并返回反转后的链表。
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Recursion_Reversed reversed = new Recursion_Reversed();
        Linked_List list = new Linked_List();
        Linked_Node head = new Linked_Node();

        System.out.println("请输入数据个数：");
        list.set_Linked_List(in.nextInt());

        head.setNext(reversed.Reversed(list.return_Head_Node().getNext()));
        list.setHead(head);
        list.print_All();



    }


}