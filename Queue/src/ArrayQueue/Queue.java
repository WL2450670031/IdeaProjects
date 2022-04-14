package ArrayQueue;
//循环队列
public class Queue
{
    int size = 100;

    Data[] queue = new Data[size];

    int front = 0;//头,入队
    int rear = 0;//尾，出队

    public Queue()
    {
        super();
    }

    public boolean addData(Data data)//入队
    {
        if(front == (rear + 1) % size)//判断队列是否满
        {
            return false;   //这番操作后如果rear等于front，说明队列满了
        }
        else
        {
            rear = (rear + 1) % size;//循环
            queue[rear] = data;
            return true;
        }
    }

    public Data getData()//出栈
    {
        if(front == rear)//判断是否空
        {
            return null;
        }
        else
        {
            front = (front + 1) % size;//循环
            return queue[front];
        }
    }

    public void printAll()
    {
        int i = front;
        int j = rear;

        if(i == j)//判断是否空
        {
            System.out.println("null");
        }
        else
        {
            do
            {
                i = (i + 1) % size;
                System.out.println(i + " " + queue[i]);

            } while (i != j);
        }
    }
}
