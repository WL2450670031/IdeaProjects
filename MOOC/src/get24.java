import java.util.Scanner;
//����4�������Ƿ���ͨ��һϵ�����㣬���24.
//���� ����ʦ��ѧԺ �������
//begin     2022.1.23 18:19
//happyend  2022.1.23 19:46
public class get24
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double[] a = new double[5];
        for(int i = 0;i < 4;i++)
        {
            a[i] = in.nextDouble();
        }
        in.close();
        if(get_24(a,4))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public static boolean get_24(double[] a, int n)
    {
        if(n == 1)
        {
            return is24(a[0]);
        }

        double[] b = new double[5];

        for(int i = 0;i <  n-1;i++)
        {
            for(int j = i+1;j < n;j++)//i and j�ֱ�ѡ�����������м���
            {
                int m = 0;
                for(int k = 0;k < n;k++)//��û��ѡ�ϵ����������´���
                {
                    if(k != i && k!=j)
                    {
                        b[m++] = a[k];
                    }
                }
                //��ʼ����
                b[m] = a[i] + a[j];
                if(get_24(b,m+1))
                {
                    System.out.println(a[i]+"+"+a[j]+"="+b[m]);
                    return true;
                }

                b[m] = a[i] - a[j];
                if(get_24(b,m+1))
                {
                    System.out.println(a[i]+"-"+a[j]+"="+b[m]);
                    return true;
                }

                b[m] = a[j] - a[i];
                if(get_24(b,m+1))
                {
                    System.out.println(a[j]+"-"+a[i]+"="+b[m]);
                    return true;
                }

                b[m] = a[i] * a[j];
                if(get_24(b,m+1))
                {
                    System.out.println(a[i]+"*"+a[j]+"="+b[m]);
                    return true;
                }

                if(Math.abs(a[j]) > 1e-6)
                {
                    b[m] = a[i]/a[j];
                    if (get_24(b, m + 1))
                    {
                        System.out.println(a[i]+"/"+a[j]+"="+b[m]);
                        return true;
                    }
                }

                if(Math.abs(a[i]) > 1e-6)
                {
                    b[m] = a[j]/a[i];
                    if (get_24(b, m + 1))
                    {
                        System.out.println(a[j]+"/"+a[i]+"="+b[m]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean is24(double x)
    {
        return Math.abs(x-24.0) <= 1e-6;
    }
}
