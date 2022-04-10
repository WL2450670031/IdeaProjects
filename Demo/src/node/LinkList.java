package node;
/*
    public LinkList()//构造空链表
    public Node<T> getHead()//获取链表头结点
    public boolean add(T obj, int pos)//在链表中插入一个新元素
    public T remove(int pos)//删除元素
    public int find(T head)//查找元素
    public boolean modify(T head,int pos)//更新某个元素
    public int size()//求数据元素个数
    public boolean isEmpty()//判空
    public T value(int pos)//获取某个元素
    public void nextOrder()//依次访问链表中每个元素并输出
    public void clear()//销毁链表
 */
public class LinkList<T>
{
     Node<T> head;//头结点
     int length;//单链表长度

    public LinkList()//构造空链表
    {
        length=0;
        head=new Node<T>(null);
    }

    public Node<T> getHead()//获取链表头结点
    {
        return head;
    }

    public boolean add(T obj, int pos)//在链表中插入一个新元素
    {
        if((pos<1||pos>length+1))
        {
            System.out.println("posError");
            return false;
        }
        int num=1;
        Node<T> p=head;
        Node<T> q=head.next;
        while(num<pos)
        {
            p=q;
            q=q.next;
            num++;
        }
        p.next=new Node<T>(obj,q);
        length++;
        return true;
    }

    public T remove(int pos)//删除元素
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            if (pos < 1 || pos > length + 1)
            {
                return null;
            }
        }
        int num=1;
        Node<T> p=head;
        Node<T> q=head.next;
        while(pos>num)
        {
            p=q;
            q=q.next;
            num++;
        }
        p.next=q.next;
        length--;
        return q.data;
    }

    public int find(T head)//查找元素
    {
        if(isEmpty())
        {
            return -1;
        }
        int num=1;
        Node<T> p=this.head.next;
        while(p!=null)
        {
            if(!p.data.equals(head))//从第一个元素开始查找，不同就继续找下一个比较
            {
                p=p.next;
                num++;
            }
            else//找到了自动退出循环
                break;
        }
        if(p==null)//若while因为条件不满足退出，说明没有该元素
        {
            return -1;
        }
        return num;
    }

    public boolean modify(T head,int pos)//更新某个元素
    {
        if(isEmpty())
        {
            return false;
        }
        else
        {
            if(pos<1||pos>length+1)
                return false;
        }
        int num=1;
        Node<T> q=(this.head).next;
        while(pos>num)
        {
            q=q.next;
            num++;
        }
        q.data=head;
        return true;
    }

    public int size()//求数据元素个数
    {
        return length;
    }

    public boolean isEmpty()//判空
    {
        return length==0;
    }

    public T value(int pos)//获取某个元素
    {
        if(isEmpty())
        {
            System.out.println("null");
            return null;
        }
        else
        {
            if(pos<1||pos>length+1)
            {
                System.out.println("posError");
                return null;
            }
        }
        int num=1;
        Node<T> q=head.next;
        while(num<pos)
        {
            q=q.next;
            num++;
        }
        return q.data;
    }

    public void nextOrder()//依次访问链表中每个元素并输出
    {
        Node<T> p=head.next;
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
    }

    public void clear()//销毁链表
    {
        int num=1;
        Node<T> q=head.next;
        while(length!=num)
        {
            q=q.next;
            q.data=null;
            num++;
        }
        length=0;
    }
}
