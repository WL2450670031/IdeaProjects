//汉诺塔
import java.util.Scanner;
public class M3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();//盘子的数量（n<=10）
        hanoi(n,'A','B','C');
    }

    /**
     * 递归实现汉诺塔问题
     *
     * @param n 盘子的数量
     * @param a 起始柱
     * @param b 中转柱
     * @param c 目标柱
     */
    private static void hanoi(int n, char a, char b, char c)
    {


        if(n == 1)
        {//递归的终止条件
            System.out.println(n+":"+a+"->"+c);
        }
        else
        {
            hanoi(n - 1, a, c, b);//将a柱子上的n-1个盘移到b柱子上
            System.out.println(n+":"+a+"->"+c);
            hanoi(n - 1, b, a, c);//将b柱子上的n-1个盘子移到c柱子上
        }
    }

}
