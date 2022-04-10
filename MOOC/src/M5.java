import java.util.Scanner;
//吴乐 汉江师范学院 软件工程
//逆波兰表达式
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
