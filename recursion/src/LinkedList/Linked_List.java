package LinkedList;
//标准链表
import java.util.Arrays;
import java.util.Scanner;

public class Linked_List
{
    /*
    需求:
    1.建立链表，然后向里面加入数据 *
    2.获取链表头结点 *
    3.更新链表里面的某个数据 *
    4.删除链表里面的某个数据 *
    5.查找链表里面的某个数据 *
    6.向链表里面某个位置插入数据 *
    7.返回链表长度（算头结点）*
    8.输出链表全部数据 *
    9.链表排序 *
     */

    private Linked_Node head;
    private int length;
    Scanner in = new Scanner(System.in);

    public Linked_List()
    {
        head = new Linked_Node();
        length = 1;
    }

    public void setHead(Linked_Node head)
    {
        this.head = head;
    }

    public void setLength(int length)
    {
        this.length = length;
    }
    public void set_Linked_List(int num)//建立链表，然后向里面加入数据
    {
        Linked_Node p = head;

        while((num--)>0)
        {
            p.setNext(new Linked_Node());//为下个结点开辟空间
            p = p.getNext();//p指向下一个结点
            p.setData(new Linked_Data(in.nextInt()));//输入数据
            ++length;//链表长度加一
        }
    }

    public boolean add_Data(Linked_Data data,int pos)//插入结点，将第pos个结点后移一位，替代第pos个结点的位置，
    {
        Linked_Node p = head;
        Linked_Node q;

        if(return_length() < pos || pos < 1)//如果要插入的地方越界 或者 pos值错误，就返回false
        {
            return false;
        }
        else if(return_length() == pos+1)//要插入的地方是链表的最后一个数据.
        {
            while(pos-- > 1)
            {
                p = p.getNext();
            }
            Linked_Node next = new Linked_Node();
            next.setData(data);//新建结点
            p.setNext(next);//将结点插入到指定位置
            ++length;

            return true;
        }
        else
        {
            while(pos-- > 1)
            {
                p = p.getNext();
            }
            q = p.getNext();
            Linked_Node next = new Linked_Node();
            next.setData(data);//新建结点
            p.setNext(next);//将结点插入到指定位置
            p.getNext().setNext(q);//连接链表
            ++length;

            return true;
        }
    }

    public boolean delete_Data(int pos)//删除第pos个结点.
    {
        Linked_Node p = head;
        Linked_Node q;

        if(return_length() == 1 || pos < 1 || pos >= return_length())
        {
            return false;
        }
        else if(return_length() == pos+1)
        {
            while(p.getNext() == null)
            {
                p = p.getNext();
            }
            p.setData(null);
            --length;
            return true;
        }
        else
        {
            while(pos-- > 1)
            {
                p = p.getNext();
            }
            q = p.getNext();
            p.setNext(null);
            p.setNext(q.getNext());//将第pos个结点的前一个结点和后一个结点连接起来，达到删除第pos个结点的目的。
            --length;
            return true;
        }
    }

    public boolean update(Linked_Data data,int pos)//更新第pos个数据
    {
        Linked_Node p = head;

        if(return_length() == 1 || return_length() <= pos || pos <1)//链表只有头结点，或者目表越界，或者pos值错误
        {
            return false;
        }
        else
        {
            while(pos-- > 0)
            {
                p = p.getNext();
            }
            p.setData(data);
            return true;
        }
    }

    public Linked_Data get_data(int pos)//查找第pos个数据
    {
        Linked_Node p = head;

        if(return_length() == 1 || return_length() <= pos || pos <1)//链表只有头结点，或者目表越界，或者pos值错误
        {
            return null;
        }
        else
        {
            while(pos-- > 0)
            {
                p = p.getNext();
            }
            return p.getData();
        }
    }

    public boolean search()
    {
        Linked_Node p = head.getNext();
        int[] num = new int[length-1];

        if(length == 1)
        {
            return false;
        }
        else
        {
            for (int i = 0; i < length - 1; i++)//取出数据，存放至数组。
            {
                num[i] = p.getData().getNumber();
                p = p.getNext();
            }

            Arrays.sort(num);//对数据进行排序
            p = head.getNext();//p初始化

            for (int i = 0; i < length-1; i++)//将排序完了的数据放回去
            {
                p.setData(new Linked_Data(num[i]));
                p = p.getNext();
            }
            return true;
        }
    }
    public Linked_Node return_Head_Node()//返回头结点
    {
        return head;
    }

    public void print_All()//输出所有数据
    {
        Linked_Node p = head.getNext();//第一个数据

        if(return_length() == 1)//如果没有数据返回空
        {
            System.out.println("null");
        }
        else
        {
           System.out.println("数据: "+p);
        }
    }

    public int return_length()
    {
        return length;
    }
}
