package Demo;

import java.util.Scanner;
//���������ܵ����
public class Demo2_7
{
    public static void main(String[] args )
    {
        int option;//ѡ����
        do
        {
            int x;
            menu();
            option=printNum();
            switch (option)
            {
                case 1:{
                    //�ж�����
                    System.out.println("������һ������:");
                    x=printNum();
                    if(isPrime(x))
                        System.out.println(x+"������");
                    else
                        System.out.println(x+"��������");
                    break;
                }
                case 2: {
                    //��������
                    System.out.println("����Ҫ�����ڵ���������");
                    System.out.println("�����������:");
                    x = printNum();//��x���ڵ�������
                    getIntimacy(x);
                    break;
                }
                case 3: {
                    //��ϰ��
                    System.out.println("����Ҫ��ϰ�����⣿");
                    System.out.println("����������:");
                    x=printNum();
                    exercise(x);
                    break;
                }
                case 4:System.out.println("���˳�");break;
                default:System.out.println("�������");
            }
        }while(option!=4);
    }
    public static boolean isPrime(int x)//֤�������ķ���
    {
        boolean j=true;
        for(int i=2;i<Math.sqrt(x);i++)
            if(x%i==0) {
                j=false;
                break;//һ�����ֿ��Ա������������Ͳ����ٱȽ���
            }
        return j;
    }

    public static void getIntimacy(int x)//���������ķ���
    {
        int a,b,count=0,sumDviB=0;//������a���Լ���a������֮�ͼ�������b
        for(a=1;a<x;a++)
        {
            b=1;
            for (int i = 2; i <= Math.sqrt(a); i++)
                if (a%i==0)             //�����a��������֮��b
                    b+=i+a/i;               //i��a/i����a������
            if(a<b)                         //ֻ���a<b�����
            {
                sumDviB=1;                  //b������֮��
                for(int i=2;i<=Math.sqrt(b);i++)
                    if(b%i==0) //���b��������֮��
                        sumDviB+=i+b/i;
            }
            if(sumDviB==a)    //a��������֮��Ϊb��b������֮��sumDviB����a��ȣ�����һ��������
            {
                System.out.println(a + "��" + b + "��һ��������");
                count++;//ͳ���������ж��ٶ�
            }
        }
        System.out.println("����"+count+"����������");
    }
    public static void exercise(int x)//������ϰ�ķ���
    {
        int m,n;
        int op;
        int resInput,resCalculate=0;
        int T=0,F=0;//������ȷ�ʹ��������
        Scanner scn=new Scanner(System.in);
        do{
            m=(int)(Math.random()*100);
            n=(int)(Math.random()*100);//����õ��������֣���Χ��[0,100).
            op=(int)(Math.random()*4);//����õ�0~3��0�ӷ�.1����.2�˷�.3������
            switch(op)
            {
                case 0:System.out.println(m+"+"+n+"=");resCalculate=m+n;break;
                case 1:System.out.println(m+"-"+n+"=");resCalculate=m-n;break;
                case 2:System.out.println(m+"*"+n+"=");resCalculate=m*n;break;
                case 3:{
                    System.out.println(m+"/"+n+"=");
                    System.out.println("�����������֣�������������");
                    resCalculate=m/n;
                }
            }
            System.out.println("�������:");
            resInput=scn.nextInt();//����𰸡�
            if(resInput==resCalculate){
                System.out.println("�ش���ȷ");
                T++;}
            else {
                System.out.println("�ش����");
                F++;}
        }while((T+F)<x);
        System.out.println("��"+x+"���⣬"+"���"+T+"����"+"���"+F+"��");
    }
    public static int printNum()//�õ�һ�����ֵķ���
    {
        int x;
        Scanner scn = new Scanner(System.in);
        x=scn.nextInt();
        return x;
    }
    public static void menu()//����˵��ķ���
    {
        System.out.println("������ѡ����:");
        System.out.println("1.�ж�����");
        System.out.println("2.���������");
        System.out.println("3.������ϰ��");
        System.out.println("4.�˳�");
    }
}
