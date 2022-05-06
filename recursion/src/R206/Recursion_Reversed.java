package R206;

import LinkedList.Linked_Node;

public class Recursion_Reversed
{
    public Linked_Node Reversed(Linked_Node head)
    {
        if(head == null || head.getNext() == null)
        {
            return head;
        }
        else
        {
            Linked_Node newHead = Reversed(head.getNext());

            head.getNext().setNext(head) ;
            head.setNext(null);

            return newHead;
         }
    }
}
