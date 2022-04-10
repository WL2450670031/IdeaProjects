package Stack;
import java.util.Scanner;
//����ʵ��ջ
public class ArrayStack {

    static int head=-1;//ջ��
//    int tail=0;//ջβ
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int num;
        int i;
        String tobe;
        int[] namestack;
        System.out.println("Ҫ����ջ��");
        num=scn.nextInt();
        namestack=new int[num];
        do {
            menu();
            System.out.println("�����������");
            tobe = scn.next();
            i = goTo(tobe);
            switch (i)
            {
                case 1: push(namestack,num);break;
                case 2: get(namestack);break;
                case 3: clear(namestack);break;
                case 4:back(namestack);break;
                case 5: watch(namestack);break;
                case -1:System.out.println("�˳�");
            }
        }while(i!=-1);
    }
    public static void push(int[] namestack,int num)//��ջ
    {
        Scanner scn = new Scanner(System.in);
        if(head>=num+1)
            System.out.println("����");
        else
        {
            System.out.println("����������:");
            head++;
            namestack[head] = scn.nextInt();//�������ݣ���ջ
        }
    }
    public static void get(int[] namestack)//��ջ
    {
        if(head==-1)
            System.out.println("null");
        else
        {
            System.out.println("ջ��Ԫ��Ϊ:");
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
        System.out.println("���");
    }
    public static void back(int[] namestack)
    {
        if(head==-1)
            System.out.println("null");
        else
            namestack[head]=' ';
        head--;
    }
    public static void menu()//�˵�
    {
        System.out.println("push,��ջ");
        System.out.println("get,��ջ");
        System.out.println("clear,���ջ");
        System.out.println("back,ɾ��ջ��Ԫ��");
        System.out.println("watch,�鿴ջ��״̬������Ϊ����ֵ���������򷵻ؿ�");
        System.out.println("exit,�˳�");
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
