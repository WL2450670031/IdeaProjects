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

    public boolean equals(Linked_Node node) {
        if(this.data.equals(node.data))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        if(next != null)
            return data + " -> " + next + " ";
        else
            return data + "";
    }
}
