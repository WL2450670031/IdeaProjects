package Demo;

import java.util.Scanner;
//有三个功能的玩具
public class Demo2_7
{
    public static void main(String[] args )
    {
        int option;//选择功能
        do
        {
            int x;
            menu();
            option=printNum();
            switch (option)
            {
                case 1:{
                    //判断素数
                    System.out.println("请输入一个数字:");
                    x=printNum();
                    if(isPrime(x))
                        System.out.println(x+"是素数");
                    else
                        System.out.println(x+"不是素数");
                    break;
                }
                case 2: {
                    //求亲密数
                    System.out.println("你想要几以内的亲密数？");
                    System.out.println("请输入该数字:");
                    x = printNum();//求x以内的亲密数
                    getIntimacy(x);
                    break;
                }
                case 3: {
                    //练习题
                    System.out.println("你想要练习几道题？");
                    System.out.println("请输入数字:");
                    x=printNum();
                    exercise(x);
                    break;
                }
                case 4:System.out.println("已退出");break;
                default:System.out.println("输入错误！");
            }
        }while(option!=4);
    }
    public static boolean isPrime(int x)//证明素数的方法
    {
        boolean j=true;
        for(int i=2;i<Math.sqrt(x);i++)
            if(x%i==0) {
                j=false;
                break;//一旦发现可以被其他数整除就不用再比较了
            }
        return j;
    }

    public static void getIntimacy(int x)//求亲密数的方法
    {
        int a,b,count=0,sumDviB=0;//亲密数a，以及，a的因子之和及亲密数b
        for(a=1;a<x;a++)
        {
            b=1;
            for (int i = 2; i <= Math.sqrt(a); i++)
                if (a%i==0)             //先求出a的因子数之和b
                    b+=i+a/i;               //i和a/i都是a的因子
            if(a<b)                         //只输出a<b的情况
            {
                sumDviB=1;                  //b的因子之和
                for(int i=2;i<=Math.sqrt(b);i++)
                    if(b%i==0) //求出b的因子数之和
                        sumDviB+=i+b/i;
            }
            if(sumDviB==a)    //a的因子数之和为b，b的因子之和sumDviB又与a相等，则是一对亲密数
            {
                System.out.println(a + "和" + b + "是一对亲密数");
                count++;//统计亲密数有多少对
            }
        }
        System.out.println("共有"+count+"对亲密数。");
    }
    public static void exercise(int x)//进行练习的方法
    {
        int m,n;
        int op;
        int resInput,resCalculate=0;
        int T=0,F=0;//计算正确和错误的数量
        Scanner scn=new Scanner(System.in);
        do{
            m=(int)(Math.random()*100);
            n=(int)(Math.random()*100);//随机得到两个数字，范围是[0,100).
            op=(int)(Math.random()*4);//随机得到0~3，0加法.1减法.2乘法.3除法。
            switch(op)
            {
                case 0:System.out.println(m+"+"+n+"=");resCalculate=m+n;break;
                case 1:System.out.println(m+"-"+n+"=");resCalculate=m-n;break;
                case 2:System.out.println(m+"*"+n+"=");resCalculate=m*n;break;
                case 3:{
                    System.out.println(m+"/"+n+"=");
                    System.out.println("输入整数部分，不用四舍五入");
                    resCalculate=m/n;
                }
            }
            System.out.println("请输入答案:");
            resInput=scn.nextInt();//输入答案。
            if(resInput==resCalculate){
                System.out.println("回答正确");
                T++;}
            else {
                System.out.println("回答错误");
                F++;}
        }while((T+F)<x);
        System.out.println("共"+x+"道题，"+"答对"+T+"道，"+"答错"+F+"道");
    }
    public static int printNum()//得到一个数字的方法
    {
        int x;
        Scanner scn = new Scanner(System.in);
        x=scn.nextInt();
        return x;
    }
    public static void menu()//输出菜单的方法
    {
        System.out.println("输入编号选择功能:");
        System.out.println("1.判断素数");
        System.out.println("2.获得亲密数");
        System.out.println("3.算术练习器");
        System.out.println("4.退出");
    }
}
