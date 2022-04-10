import java.util.Scanner;

//n�ʺ�����
public class M4
{
    static int N = 20;//���ʺ���Ŀ
    static int[] q = new int[21];//�����ʺ����ڵ��к�
    static int cont = 0;//�������

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("������ʺ����:");
        int n = in.nextInt();
        if(n > N || n < 1)
        {
            System.out.println("�������");
        }
        else if(n == 2 || n == 3)
        {
            System.out.println("�޽�");
        }
        else
        {
            place(1,n);
        }

    }
    public static void print(int n)
    {
        cont++;

        System.out.print("��"+cont+"����Ϊ:");
        for(int i = 1;i <=n;i++)
        {
            System.out.printf("(%d,%d)",i,q[i]);
        }
        System.out.println();
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= n;j++)
            {
                if(q[i]!=j)
                    System.out.print("x ");
                else
                    System.out.print("O ");
            }
            System.out.println();
        }
    }
    //�����i�е�k���Ƿ���԰ڷŻʺ�
    public static boolean find(int i,int k)
    {
        int j = 1;
        while(j < i)//j = 1~i-1�����Ѿ������˻ʺ����
        {
            if(q[j] == k || Math.abs(j-i) == Math.abs(q[j] - k))
                //��⵱ǰλ���Ƿ��������ʺ�������б����
                return false;
            j++;
        }
        return true;
    }

    public static void place(int k,int n)//�ڵ�k�з��÷��ûʺ�
    {
        if(k > n)//�����������
            print(n);
        else
        {
            for(int i = 1;i <= n;i++)
            {
                if(find(k,i))
                {
                    q[k] = i;//�ڵ�k�е�i�з��ûʺ�
                    place(k+1,n);
                }
            }
        }
    }
}