/*
���� ����ʦ��ѧԺ �������
begin    2022.1.29 17:30
happyend 2022.1.19 17:47
*/
public class M9
{
    public static void main(String[] args)
    {
        System.out.println(getRoot());
    }
    public static double getRoot()
    {
        double root;//��
        double x1 = 0;//�Ͻ�
        double x2 = 100;//�½�
        double y;
        root = (x1 + x2)/2;
        y = getFun(root);
        while(Math.abs(y) > 1E-6)
        {
            if(y > 0)
            {//���y����0��˵���������
                x2 = root;
            }
            else//���yС��0��˵�������ұ�
                x1 = root;
            root = x1 + (x2-x1)/2;
            y = getFun(root);
        }
        return root;
    }
    public static double getFun(double x)
    {
        return x*x*x - 5*x*x + 10*x -80;//���󷽳̣����������޸�
    }
}