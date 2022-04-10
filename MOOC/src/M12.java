import java.util.Scanner;

/*
��̬�滮
�������������·��
���� ����ʦ��ѧԺ �������
2022.2.11
2022.2.11
 */
public class M12
{
    static final int MAX = 101;
    static int[][] D = new int[MAX][MAX];//���������
    static int[][] max = new int[MAX][MAX];//��¼���
    static int n;//����������

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i;
        int j;

        System.out.println("����������������:");
        n = in.nextInt();

        System.out.println("������������:");
        for(i = 0;i < n;i++)
        {
            System.out.println("��"+(i+1)+"��:");
            for(j = 0;j <= i;j++)
            {
                D[i][j] = in.nextInt();
                max[i][j] = -1;
            }
        }

        in.close();

        for(i = 0;i < n;i++)
        {
            for(j = 0;j <= i;j++)
            {
                System.out.print(D[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(maxSum(0,0));
    }

    public static int maxSum(int i,int j)
    {
        if(max[i][j] != -1)
        {
            return max[i][j];
        }
        if(i == n)
        {
            max[i][j] = D[i][j];
        }
        else
        {
            max[i][j] = Math.max(maxSum(i+1,j+1),maxSum(i+1,j))+D[i][j];
        }

        return max[i][j];
    }
}
