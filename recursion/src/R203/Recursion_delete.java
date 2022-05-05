package R203;

import LinkedList.Linked_Data;
import LinkedList.Linked_Node;

public class Recursion_delete
{
    public Linked_Node recursion_Delete(Linked_Node head, Linked_Data data)
    {
        if(head == null)
        {
            return null;
        }
        else
        {
            head.setNext(recursion_Delete(head.getNext(),data));
            return head.getData().equals(data) ? head.getNext() : head;
        }
    }
}
