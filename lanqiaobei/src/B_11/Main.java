package B_11;
//十六进制转十进制
//begin    2022.1.14 17:28
//happyend 2022.1.14 17:58
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String S = in.next();//输入字符串
        S = S.toUpperCase();//将字符串里的字符转换为大写
        char[] C = S.toCharArray();//将字符串转换为字符数组，方便处理。
        long num = 0;//结果数组

        int n = C.length;

        for(int i = 0;i < n;i++)
        {
            switch(C[i])
            {
                //如果是字母字符就单独转化为数字处理
                case 'A':num += 10 * Math.pow(16,n-i-1);break;
                case 'B':num += 11 * Math.pow(16,n-i-1);break;
                case 'C':num += 12 * Math.pow(16,n-i-1);break;
                case 'D':num += 13 * Math.pow(16,n-i-1);break;
                case 'E':num += 14 * Math.pow(16,n-i-1);break;
                case 'F':num += 15 * Math.pow(16,n-i-1);break;
                //如果是数字字符就转化为数字处理
                default :num += ((int)C[i]-48)*Math.pow(16,n-i-1);
            }
        }
        System.out.println(num);
    }
}
