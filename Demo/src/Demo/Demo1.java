package Demo;

public class Demo1
{
    public static void main(String[] args)
    {
        int n=1;//��������n+1��Ů���ѡ�
        for(int i = 0;i<=n;i++)
        {
            System.out.println("Ů:����û��Ů����\n");
            if(i==0)
                System.out.println("��:û�а�\n");
            else
                System.out.println("��:��"+i+"��\n");
            System.out.println("Ů:�ð�����������"+(i+1)+"����\n");
            if(i!=n)
                System.out.println("��:�ȵȣ�������һ��\n");
        }
    }
}