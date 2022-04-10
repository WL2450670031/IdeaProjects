package usps;

import java.util.Scanner;

public class Polynomial
{
    public Polynomial(){}

    public  LinkList inPoly()//建立一个多项式
    {
        Scanner scn=new Scanner(System.in);

        int length;//结点个数

        LinkList list=new LinkList();

        length = scn.nextInt();//输入多项式的各项参数

        //排序
        for(int i = 1;i <=length;i++)//将参数放进链表
        {
            list.add(scn.nextDouble(),scn.nextDouble(),i);
        }
        return sort(notTwo(list));
    }

    public LinkList addPoly(LinkList a,LinkList b)//多项式相加
    {
        LinkList list = new LinkList();//存储结果的链表

        Node a1=a.head.next;//a的头结点
        Node b1=b.head.next;//b的头结点

        int length = 1;//结果链表的长度。

        while(a1!=null && b1!=null)
        {
            if(a1.index==b1.index)//如果指数相同，则系数相加
            {
                list.add(a1.coefficient+b1.coefficient,a1.index,length++);
                a1 = a1.next;
                b1 = b1.next;//指针后移，排除已经赋值给结果链表的结点
            }
            else
            {
                if (a1.index > b1.index)
                //如果a1结点系数大于b1结点系数，就提出a1的值，因为b中都是比a1指数小的，不需要再比
                {
                    list.add(a1.coefficient, a1.index, length++);
                    a1 = a1.next;
                    //b1没有入链表，下一次还要比较一遍
                }
                else//如果a1结点系数小于b1结点系数，就提出b1的值，因为a中都是比b1指数小的，不需要再比
                {
                    list.add(b1.coefficient, b1.index, length++);
                    b1 = b1.next;
                    //a1没有入链表，下一次还要再比一遍
                }
            }
        }
        //将没有比完的结点都赋值给结果链表，此时另外一个链表是空的
        while(a1!=null)
        {
            list.add(a1.coefficient,a1.index,length++);
            a1 = a1.next;//下一个结点
        }
        while(b1!=null)
        {
            list.add(b1.coefficient,b1.index,length++);
            b1 = b1.next;
        }
        list.setLength(length);
        return sort(list);
    }

    public LinkList minusPoly(LinkList a,LinkList b)//多项式相减
    {
        LinkList list = new LinkList();//存储结果的链表

        Node a1 = a.head.next;
        Node b1 = b.head.next;

        int length = 1;
        while (a1 != null && b1 != null)
        {
            if (a1.index == b1.index)
            {
                list.add(a1.coefficient - b1.coefficient,a1.index,length++);
                a1 = a1.next;
                b1 = b1.next;
            }
            else
            {
                if (a1.index > b1.index)
                {
                    list.add(a1.coefficient, a1.index, length++);
                    a1 = a1.next;
                    //b1没有入链表，下一次还要比较一遍
                }
                else
                {
                    list.add(-b1.coefficient, b1.index, length++);
                    b1 = b1.next;
                }
            }
        }
        while(a1!=null)
        {
            list.add(a1.coefficient,a1.index,length++);
            a1 = a1.next;//下一个结点
        }
        while(b1!=null)
        {
            list.add(-b1.coefficient,b1.index,length++);
            b1 = b1.next;
        }
        return sort(list);
    }

    public LinkList mulPoly(LinkList a,LinkList b)//多项式相乘
    {
        LinkList list = new LinkList();//存储结果的链表

        Node a1=a.head.next;//a的头结点

        int length = 0;//结果链表的长度。

        while(a1!=null )//将a的每个项乘b的每个项
        {
            Node b1=b.head.next;//b的头结点
            //每个轮回让b1回到第一个结点
            while(b1!=null)
            {
                list.add(a1.coefficient*b1.coefficient, a1.index+b1.index, ++length);
                list.length=length;
                b1=b1.next;
            }
            a1 = a1.next;
        }
        return sort(notTwo(list));
    }

    public double getXValue(LinkList a,double x)//多项式在x处的值
    {
        double num=0;
        Node p = a.head.next;
        while(p!=null)
        {
            num+=p.coefficient*(Math.pow(x,p.index));
            p = p.next;
        }
        return num;
    }

    public LinkList derfPoly(LinkList a)//求导函数
    {
        Node p = a.head.next;
        while(p!=null)
        {
            p.setCoefficient(p.coefficient*p.index);
            p.setIndex(p.index-1);
            p = p.next;
        }
        return a;
    }

    public LinkList sort(LinkList list)//排序
    {
            Node p = list.head.next;

            if (list.isEmpty())
            {
                return list;
            }
            else
            {
                while (p != null)
                {
                    Node q = p.next;
                    Node r = new Node();//中转
                    while (q != null)
                    {
                        if (p.index < q.index)
                        {
                            r.setCoefficient(q.coefficient);
                            r.setIndex(q.index);
                            q.setCoefficient(p.coefficient);
                            q.setIndex(p.index);
                            p.setCoefficient(r.coefficient);
                            p.setIndex(r.index);
                        }
                        q = q.next;
                    }
                    p = p.next;
                }
            }
        return list;
    }

    public LinkList notTwo(LinkList a)//合并同类项
    {
        LinkList list = new LinkList();

        Node p=a.head.next;

        int length=0;
        while(p!=null)//每个轮回会将当前第一个结点与剩余结点比较，合并同类项
        {
            Node q=p.next;
            double coefficient=p.coefficient;
            while(q!=null)
            {
                if(p.index==q.index)//如果指数相等，则合并
                {
                    coefficient += q.coefficient;
                    q.setCoefficient(0);//删除被合并的结点
                    q.setIndex(0);
                }
                q = q.next;//比较下一个结点
            }
            list.add(coefficient,p.index,++length);//比完一个轮回，将当前的第一个结点输入链表
            p = p.next;
        }
        return list;
    }
}

