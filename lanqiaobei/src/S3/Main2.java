package S3;
/*
* �� 2019 �ֽ�� 3 ��������ͬ��������֮�ͣ�
* ����Ҫ��ÿ�������������������� 2 �� 4��һ���ж����ֲ�ͬ�ķֽⷽ����
*/
public class Main2
{
    public static void main(String[] args)
    {
        int num = 0;
        for(int i = 1;i < 2019;i++)//��1����
        {
            if(have2or4(i))
                continue;
            for(int j = i+1;j < 2019;j++)//��2����
            {
               if(have2or4(j) )
                   continue;
               for(int k = j+1;k <2019;k++)
               {
                   if (have2or4(k))
                       continue;
                   if (i + j + k == 2019)
                       num++;
               }
            }
        }
        System.out.println(num);
    }

    public static boolean have2or4(int n)
    {
        while(n!=0)
        {
            if(n%10==2||n%10==4)
                return true;
            n/=10;
        }
        return false;
    }
}
