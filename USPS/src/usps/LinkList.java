package usps;

public class LinkList {
    Node head;//头结点
    int length;//单链表长度

    public LinkList()//构造空链表
    {
        length = 0;
        head = new Node(null);
    }

    public void add(double s1,double s2, int pos)//在链表中加入数据
    {
        int num=1;
        Node p=head;
        Node q=head.next;
        while(num<pos)
        {
            p=q;
            q=q.next;
            num++;
        }
        p.next=new Node(q,s1,s2);//头结点不存放数据
        length++;
    }

    public void allPut()//链表全部输出
    {
        if(isEmpty())
        {
           System.out.println("null");
        }
        else
        {
            Node p=head.next;

            System.out.print("(");
            if(p.coefficient!=0)//系数不等于0才会输出。
            {
                if(p.coefficient!=1.0) //如果系数等于1就不用输出
                {
                    if(p.coefficient == -1 && p.index != 0)
                        System.out.print("-");
                    else
                        System.out.print(p.coefficient);//输出系数
                }
                if(p.coefficient == 1.0 && p.index ==0)
                {
                    System.out.println(1);
                }

                if(p.index != 0 && p.index != 1.0)
                {
                    System.out.print("X^" + p.index);
                }
                else if(p.index == 1.0)//如果指数等于1,就不输出指数
                {
                    System.out.print("X");
                }
            }

            p=p.next;

            while(p!=null)
            {
                if(p.coefficient!=0)//系数不等于0才会输出。
                {
                    if(p.coefficient>0)
                    {
                        System.out.print("+");//如果系数大于0，前面就带+号
                    }

                    if(p.coefficient!=1) //如果系数等于1就不用输出
                    {
                        if(p.coefficient == -1 && p.index != 0)
                            System.out.print("-");
                        else
                            System.out.print(p.coefficient);//输出系数
                    }

                    if(p.coefficient == 1 && p.index == 0)
                    {
                        System.out.print(1);
                    }

                    if(p.index != 0 && p.index != 1.0)
                    {
                        System.out.print("X^" + p.index);
                    }
                    else if(p.index == 1.0)//如果指数等于1,就不输出指数
                    {
                        System.out.print("X");
                    }
                }
                p=p.next;//继续下一个结点
            }
            System.out.print(")");
        }

    }

    public boolean isEmpty()//判空
    {
        return length==0;
    }

    public int getLength() //求链表长度
    {
        return length;
    }

    public void setLength(int length)//改变链表长度
    {
        this.length = length;
    }
}

