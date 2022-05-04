package R21;

import LinkedList.Linked_Node;

public class recursion_Search
{       //返回一个头结点也有数据的头结点
    public Linked_Node recursion_search(Linked_Node l1, Linked_Node l2)//递归链表排序
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
