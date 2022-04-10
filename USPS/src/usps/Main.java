package usps;
/*
吴乐 汉江师范学院 软件工程2001班
数据结构期末大作业 一元稀疏多项式计算器
开始  2021.12.18 22:00
完成  2021.12.26 00:21
优化  2021.12.26 18:00
*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Polynomial poly = new Polynomial();
        int num;
        do
        {//菜单
            System.out.println("\n                  一元稀疏多项式计算器");
            System.out.println("——————————————————————————————————————————————————————————");
            System.out.println(  "1.建立多项式a      2.建立多项式a+b       3.建立多项式a-b  " +
                    "\n4.建立多项式axb    5.多项式a的导函数      6.多项式在x处的值\n7.退出");
            System.out.println("——————————————————————————————————————————————————————————");
            System.out.print("命令: ");
            num=in.nextInt();
            switch (num)//命令
            {
                case 1://建立多项式
                {
                    System.out.println("请输入多项式:");
                    System.out.println("项的个数n <系数 指数>*n");
                    LinkList list = poly.inPoly();
                    System.out.print("\n多项式: ");
                    list.allPut();
                }break;

                case 2://多项式 a + b
                {
                    System.out.println("请输入多项式a:");
                    System.out.println("项的个数n <系数 指数>*n");
                    LinkList listA = poly.inPoly();
                    System.out.println("请输入多项式b:");
                    LinkList listB = poly.inPoly();
                    System.out.print("\n多项式 a : ");
                    listA.allPut();
                    System.out.print("\n多项式 b : ");
                    listB.allPut();
                    System.out.print("\n多项式 a+b : ");
                    poly.addPoly(listA,listB).allPut();
                }break;

                case 3://多项式 a - b
                {
                    System.out.println("请输入多项式a:");
                    System.out.println("项的个数n <系数 指数>*n");
                    LinkList listA = poly.inPoly();
                    System.out.println("请输入多项式b:");
                    LinkList listB = poly.inPoly();
                    System.out.print("\n多项式 a : ");
                    listA.allPut();
                    System.out.print("\n多项式 b : ");
                    listB.allPut();
                    System.out.print("\n多项式 a-b : ");
                    poly.minusPoly(listA,listB).allPut();
                }break;

                case 4://建立多项式axb
                {
                    System.out.println("请输入多项式a:");
                    System.out.println("项的个数n <系数 指数>*n");
                    LinkList listA = poly.inPoly();
                    System.out.println("请输入多项式b:");
                    LinkList listB = poly.inPoly();
                    System.out.print("\n多项式 a : ");
                    listA.allPut();
                    System.out.print("\n多项式 b : ");
                    listB.allPut();
                    System.out.print("\n多项式 axb : ");
                    poly.mulPoly(listA,listB).allPut();
                }break;

                case 5://多项式 a 的导函数
                {
                    System.out.println("请输入多项式a:");
                    System.out.println("项的个数n <系数 指数>*n");
                    LinkList listA = poly.inPoly();
                    System.out.print("\n多项式 a : ");
                    listA.allPut();
                    System.out.print("\n多项式 a 的导函数: ");
                    poly.derfPoly(listA).allPut();
                }break;

                case 6://多项式在x处的值
                {
                    System.out.println("请输入多项式a:");
                    System.out.println("项的个数n <系数 指数>*n");
                    LinkList listA = poly.inPoly();
                    System.out.println("请输入 x : ");
                    double x = in.nextDouble();
                    System.out.print("\n多项式 a : ");
                    listA.allPut();
                    System.out.print("\nx: "+x);
                    System.out.printf("\na(x)为(保留三位小数): %.3f",poly.getXValue(listA,x));
                }break;

                case 7://退出
                {
                    System.out.println("再见");
                }break;

                default:System.out.println("输入错误");
            }
        }while(num!=7);
    }
}
