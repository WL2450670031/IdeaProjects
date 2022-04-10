//��ŵ��
import java.util.Scanner;
public class M3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();//���ӵ�������n<=10��
        hanoi(n,'A','B','C');
    }

    /**
     * �ݹ�ʵ�ֺ�ŵ������
     *
     * @param n ���ӵ�����
     * @param a ��ʼ��
     * @param b ��ת��
     * @param c Ŀ����
     */
    private static void hanoi(int n, char a, char b, char c)
    {


        if(n == 1)
        {//�ݹ����ֹ����
            System.out.println(n+":"+a+"->"+c);
        }
        else
        {
            hanoi(n - 1, a, c, b);//��a�����ϵ�n-1�����Ƶ�b������
            System.out.println(n+":"+a+"->"+c);
            hanoi(n - 1, b, a, c);//��b�����ϵ�n-1�������Ƶ�c������
        }
    }

}
