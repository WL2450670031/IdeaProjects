package Levelorder;

//队列操作

public class LinkQueue
{
    final LinkedNode head;//头结点
    int length;//队列长度
    final int front;//队列顶
    int rear;//队列尾

    public LinkQueue()
    {
        head = new LinkedNode();
        front = 1;
        rear = 1;
    }

    public void addData(LinkedNode node)//入队
    {
        LinkedNode p = head;
        LinkedNode q = p.getQueueNext();

        if (front != rear)
        {
            node.setQueueNext(q);
        }
        p.setQueueNext(node);
        length++;
        rear++;
    }

    public LinkedNode getData()//出队
    {
        LinkedNode p = head;//头结点
        LinkedNode q = p.getQueueNext();//第二个结点

        if(front == rear)
        {
            return null;
        }
        else
        {
            for(int i = front; i < rear-1; i++)
            {
                 p = q;
                 q = p.getQueueNext();
            }
            length--;
            rear--;
            return q;
        }
    }

    public void printAll()//输出队列所有数据
    {
        LinkedNode p = head;//头结点
        LinkedNode q = p.getQueueNext();//第二个结点

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
                q = p.getQueueNext();
            }
        }
    }
}
