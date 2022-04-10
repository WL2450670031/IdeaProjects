package Stack;
import java.util.Scanner;
//数组实现栈
public class ArrayStack {

    static int head=-1;//栈顶
//    int tail=0;//栈尾
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int num;
        int i;
        String tobe;
        int[] namestack;
        System.out.println("要多大的栈：");
        num=scn.nextInt();
        namestack=new int[num];
        do {
            menu();
            System.out.println("请输入操作：");
            tobe = scn.next();
            i = goTo(tobe);
            switch (i)
            {
                case 1: push(namestack,num);break;
                case 2: get(namestack);break;
                case 3: clear(namestack);break;
                case 4:back(namestack);break;
                case 5: watch(namestack);break;
                case -1:System.out.println("退出");
            }
        }while(i!=-1);
    }
    public static void push(int[] namestack,int num)//入栈
    {
        Scanner scn = new Scanner(System.in);
        if(head>=num+1)
            System.out.println("满了");
        else
        {
            System.out.println("请输入数据:");
            head++;
            namestack[head] = scn.nextInt();//输入数据，入栈
        }
    }
    public static void get(int[] namestack)//出栈
    {
        if(head==-1)
            System.out.println("null");
        else
        {
            System.out.println("栈顶元素为:");
            System.out.println(namestack[head]);
            namestack[head] = ' ';
            head--;
        }
    }
    public static void watch(int[] namestack)
    {
        if(head==-1)
            System.out.println("null");
        else
        {
            for(int i=0;i<=head;i++)
                System.out.print(namestack[i]+" ");
        }
    }
    public static void clear(int[] namestack)
    {
        for(int i=0;i<=head;i++)
        {
            namestack[i]=' ';
            head--;
        }
        System.out.println("清空");
    }
    public static void back(int[] namestack)
    {
        if(head==-1)
            System.out.println("null");
        else
            namestack[head]=' ';
        head--;
    }
    public static void menu()//菜单
    {
        System.out.println("push,入栈");
        System.out.println("get,出栈");
        System.out.println("clear,清空栈");
        System.out.println("back,删除栈顶元素");
        System.out.println("watch,查看栈的状态，若不为返回值个数，否则返回空");
        System.out.println("exit,退出");
    }
    public static int goTo(String tobe)
    {
       int i=0;
       if(tobe.equalsIgnoreCase("push"))
            i=1;
       else if(tobe.equalsIgnoreCase("get"))
           i=2;
       else if(tobe.equalsIgnoreCase("clear"))
           i=3;
       else if(tobe.equalsIgnoreCase("back"))
           i=4;
       else if(tobe.equalsIgnoreCase("watch"))
           i=5;
       else if(tobe.equalsIgnoreCase("exit"))
           i=-1;
       return i;
    }
}
