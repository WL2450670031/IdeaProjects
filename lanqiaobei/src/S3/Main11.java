package S3;
/*
���� ����ʦ��ѧԺ 2022.3.6
 */
import java.util.Scanner;

/*
С������ѧϰһ����������ԣ����������еĵ��ʶ�����СдӢ����ĸ�� �ɣ���Щ���ʺܳ���
ԶԶ��������Ӣ�ĵ��ʵĳ��ȡ�С��ѧ�˺ܳ�ʱ��Ҳ�ǲ�סһЩ���ʣ���׼��������ȫ������Щ���ʣ�
���Ǹ��ݵ������ĸ���ĸ���ֵ�������ֱ浥�ʡ����ڣ��������С��������һ�����ʺ�
���������ҵ�����������ĸ�������ĸ���ֵĴ�����

��������
����һ�а���һ�����ʣ�����ֻ��СдӢ����ĸ��ɡ�
�������е���������������ĵ��ʳ��Ȳ����� 1000��
 */
public class Main11 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        charNumber(s);
    }

    public static void charNumber(String s)
    {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int[] num = new int[26];
        for(int i = 0;i<26;i++)
            num[i] = 0;
        for(int i = 0;i<s.length();i++)
        {
            int j = a.indexOf(s.charAt(i));
            if(j != -1)
                num[j]++;//����Ƚϱ����ַ�������ĸ��Ȼ�󽫶�Ӧ���ַ�����1��
        }
        int maxIndex = getMax(num);
        System.out.println(a.charAt(maxIndex));
        System.out.println(num[maxIndex]);

    }

    public static int getMax(int[] num)//���������������±귵��
    {
        int max = 0;
        for(int i=1;i<26;i++)
        {
            if(num[i] > num[max])
                max = i;
        }
        return max;//�������������±ꡣ
    }

}
