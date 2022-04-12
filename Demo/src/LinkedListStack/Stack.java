package LinkedListStack;

public class Stack
{
    Node node;
    int length;

    public Stack()//建栈
    {
        node = new Node();
        length = 0;
    }

    public void push(Node node)//入栈
    {
        if(length != 0)//如果栈不为空
        {
            node.setNext(this.node.getNext());
            this.node.setNext(node);
        }
        else//如果栈为空
        {
            this.node.setNext(node);
        }
        length++;
    }

    public Node pop()//出栈
    {
        if(length == 0)
        {
            return null;
        }
        Node value = this.node.getNext();//栈顶元素，用来返回
        Node p = this.node;
        Node q = p.getNext();
        p.setNext(q.getNext());//删除结点
        length--;
        return value;
    }


    public void printAllNode()//全部输出
    {
        Node p = this.node;
        Node q = this.node.getNext();

        if(length == 0)
        {
            System.out.println("null");
        }
        for(int i = 1;i <= length;i++)//防止溢出
        {
            if(q.getNext() != null)
            {
                p = q;
                q = p.getNext();
            }
            else
                p = q;

            System.out.println(p);
        }
    }


}
