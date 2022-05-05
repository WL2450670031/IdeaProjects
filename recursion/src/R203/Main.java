package R203;

import LinkedList.Linked_Data;
import LinkedList.Linked_List;
import LinkedList.Linked_Node;

import java.util.Scanner;

//给定一个链表的头节点 head 和一个data，请你删除链表中所有满足值为data 的节点，并返回新的头节点 。
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Recursion_delete recursion_delete = new Recursion_delete();
        Linked_List list = new Linked_List();
        Linked_Node head = new Linked_Node();

        System.out.println("请输入数据个数：");
        list.set_Linked_List(in.nextInt());

        System.out.println("请输入要删除的数据：");
        Linked_Data data = new Linked_Data(in.nextInt());

        head.setNext(recursion_delete.recursion_Delete(list.return_Head_Node().getNext(),data));
        list.setHead(head);
        list.print_All();

    }
}
