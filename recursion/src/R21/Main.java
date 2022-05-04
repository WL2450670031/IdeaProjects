package R21;
//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的

import LinkedList.Linked_Data;
import LinkedList.Linked_List;
import LinkedList.Linked_Node;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Linked_List l1 = new Linked_List();
        Linked_List l2 = new Linked_List();

        System.out.println("l1长度:");
        l1.set_Linked_List(in.nextInt());
        l1.print_All();
        l1.search();
        l1.print_All();
//        System.out.println("l2长度:");
//        l2.set_Linked_List(in.nextInt());


    }
}
