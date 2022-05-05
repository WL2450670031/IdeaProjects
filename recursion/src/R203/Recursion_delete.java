package R203;
//删除链表里面的等于data的数据
import LinkedList.Linked_Data;
import LinkedList.Linked_Node;

public class Recursion_delete
{
    public Linked_Node recursion_Delete(Linked_Node head, Linked_Data data)//形参：头数据（不包括头结点），要删除的数据
    {
        if(head == null)//边界条件
        {
            return null;
        }
        else
        {
            head.setNext(recursion_Delete(head.getNext(),data));//对头数据的下一个结点进行递归
            return head.getData().equals(data) ? head.getNext() : head;//如果数据相等则继续比较下一个数据，否则返回
        }
    }
}
