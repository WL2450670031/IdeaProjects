import java.util.Scanner;

/*
���ֲ���
���� ����ʦ��ѧԺ �������
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
        System.out.print("��������:");
        while(true)
        {
                a[i] = in.nextInt();
                if(a[i]== 0)
                    break;
                i++;
        }
        System.out.print("����Ҫ���ҵ���:");
        int x = in.nextInt();
        in.close();
        int index = binarySeach(a,i,x);
        if(index == -1)
            System.out.println("û��");
        else
        {
            System.out.println(a[index]+"���±�:"+index);
        }
    }
    public static int binarySeach(int[] a,int size,int x)
    {
        int l = 0;//��˵�
        int r = size-1;//�Ҷ˵�
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
