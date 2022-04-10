package node;
/*
    public LinkList()//���������
    public Node<T> getHead()//��ȡ����ͷ���
    public boolean add(T obj, int pos)//�������в���һ����Ԫ��
    public T remove(int pos)//ɾ��Ԫ��
    public int find(T head)//����Ԫ��
    public boolean modify(T head,int pos)//����ĳ��Ԫ��
    public int size()//������Ԫ�ظ���
    public boolean isEmpty()//�п�
    public T value(int pos)//��ȡĳ��Ԫ��
    public void nextOrder()//���η���������ÿ��Ԫ�ز����
    public void clear()//��������
 */
public class LinkList<T>
{
     Node<T> head;//ͷ���
     int length;//��������

    public LinkList()//���������
    {
        length=0;
        head=new Node<T>(null);
    }

    public Node<T> getHead()//��ȡ����ͷ���
    {
        return head;
    }

    public boolean add(T obj, int pos)//�������в���һ����Ԫ��
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

    public T remove(int pos)//ɾ��Ԫ��
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

    public int find(T head)//����Ԫ��
    {
        if(isEmpty())
        {
            return -1;
        }
        int num=1;
        Node<T> p=this.head.next;
        while(p!=null)
        {
            if(!p.data.equals(head))//�ӵ�һ��Ԫ�ؿ�ʼ���ң���ͬ�ͼ�������һ���Ƚ�
            {
                p=p.next;
                num++;
            }
            else//�ҵ����Զ��˳�ѭ��
                break;
        }
        if(p==null)//��while��Ϊ�����������˳���˵��û�и�Ԫ��
        {
            return -1;
        }
        return num;
    }

    public boolean modify(T head,int pos)//����ĳ��Ԫ��
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

    public int size()//������Ԫ�ظ���
    {
        return length;
    }

    public boolean isEmpty()//�п�
    {
        return length==0;
    }

    public T value(int pos)//��ȡĳ��Ԫ��
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

    public void nextOrder()//���η���������ÿ��Ԫ�ز����
    {
        Node<T> p=head.next;
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
    }

    public void clear()//��������
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
