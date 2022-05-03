package LinkedList;

public class Linked_Node
{
    private Linked_Data data;
    private Linked_Node next;

    public Linked_Node()
    {
        data = new Linked_Data();
        next = null;
    }
    public Linked_Data getData() {
        return data;
    }

    public Linked_Node getNext() {
        return next;
    }

    public void setData(Linked_Data data) {
        this.data = data;
    }

    public void setNext(Linked_Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return " data : " + data + "->" + "next_Data : " + next.getData();
    }
}
