package LinkedQueue;

public class LinkQueue
{
    final Node head;//头结点
    int length;//队列长度
    final int front;//队列顶
    int rear;//队列尾

    public LinkQueue()
    {
        head = new Node();
        front = 1;
        rear = 1;
    }

    public void addData(Node node)
    {
        Node p = head;
        Node q = p.getNext();

        if (front != rear)
        {
            node.setNext(q);
        }
        p.setNext(node);
        length++;
        rear++;
    }

    public Node getData()
    {
        Node p = head;//头结点
        Node q = p.getNext();//第二个结点

        if(front == rear)
        {
            return null;
        }
        else
        {
            for(int i = front; i < rear-1; i++)
            {
                 p = q;
                 q = p.getNext();
            }
            length--;
            rear--;
            return q;
        }
    }

    public void printAll()
    {
        Node p = head;//头结点
        Node q = p.getNext();//第二个结点

        if(front == rear)
        {
            System.out.println("null");
        }
        else
        {
            for(int i = front;i < rear;i++)
            {
                System.out.println(i+" "+q);
                p = q;
                q = p.getNext();
            }
        }
    }
}
