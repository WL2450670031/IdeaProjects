import java.util.Scanner;

/*
二分查找
吴乐 汉江师范学院 软件工程
begin     2022.1.23 20:00
happyend  2022.1.23 20:49
*/

public class M8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] a = new int[101];
        int i = 0;
        System.out.print("输入数据:");
        while(true)
        {
                a[i] = in.nextInt();
                if(a[i]== 0)
                    break;
                i++;
        }
        System.out.print("输入要查找的数:");
        int x = in.nextInt();
        in.close();
        int index = binarySeach(a,i,x);
        if(index == -1)
            System.out.println("没有");
        else
        {
            System.out.println(a[index]+"的下标:"+index);
        }
    }
    public static int binarySeach(int[] a,int size,int x)
    {
        int l = 0;//左端点
        int r = size-1;//右端点
        while(l <= r)
        {
            int mind = l + (r-l)/2;
            if(a[mind] == x)
                return mind;
            else if(a[mind] > x)
                r = mind - 1;
            else
                l = mind + 1;
        }
        return -1;
    }
}
