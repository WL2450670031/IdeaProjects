import java.util.Scanner;
//���� ����ʦ��ѧԺ �������
//�沨�����ʽ
public class M5
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println(exp());
    }
    public static double exp()
    {
        String s = in.next();
        switch(s)
        {
            case "+":return exp()+exp();
            case "-":return exp()-exp();
            case "*":return exp()*exp();
            case "/":return exp()/exp();
            default :return Double.parseDouble(s);
        }
    }
}
