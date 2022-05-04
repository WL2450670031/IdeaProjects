package R21;
//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
import LinkedList.Linked_List;
import LinkedList.Linked_Node;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int length;

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

        head.setNext(recursion_search(l1.return_Head_Node().getNext(),l2.return_Head_Node().getNext()));//传头数据

        l.setHead(head);
        l.setLength(length);
        l.print_All();
    }

    public static Linked_Node recursion_search(Linked_Node l1,Linked_Node l2)//递归链表排序
    {
        if(l1 == null)
        {
            return l2;
        }
        else if(l2 == null)
        {
            return l1;
        }
        else if(l1.getData().getNumber() > l2.getData().getNumber())//如果p>q
        {
            l2.setNext(recursion_search(l1,l2.getNext()));//将为进行排序的链表继续排序
            return l2;//返回较小的值
        }
        else
        {
            l1.setNext(recursion_search(l1.getNext(),l2));
            return l1;
        }
    }
}
