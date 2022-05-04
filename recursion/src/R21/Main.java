package R21;
//将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
import LinkedList.Linked_List;
import LinkedList.Linked_Node;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int length;
        recursion_Search search = new recursion_Search();
        Linked_List l1 = new Linked_List();
        Linked_List l2 = new Linked_List();
        Linked_List l = new Linked_List();//存储结果的链表
        Linked_Node head = new Linked_Node();

        System.out.println("l1长度:");
        l1.set_Linked_List(in.nextInt());
        System.out.println("l2长度:");
        l2.set_Linked_List(in.nextInt());//输入两个链表的数据

        length = l1.return_length()+l2.return_length()-1;

        l1.search();
        l2.search();//将两个链表进行排序

        head.setNext(search.recursion_search(l1.return_Head_Node().getNext(),l2.return_Head_Node().getNext()));//传头数据

        l.setHead(head);
        l.setLength(length);
        l.print_All();
    }
}
