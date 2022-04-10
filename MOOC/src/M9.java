/*
吴乐 汉江师范学院 软件工程
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
        double root;//根
        double x1 = 0;//上界
        double x2 = 100;//下界
        double y;
        root = (x1 + x2)/2;
        y = getFun(root);
        while(Math.abs(y) > 1E-6)
        {
            if(y > 0)
            {//如果y大于0，说明根在左边
                x2 = root;
            }
            else//如果y小于0，说明根在右边
                x1 = root;
            root = x1 + (x2-x1)/2;
            y = getFun(root);
        }
        return root;
    }
    public static double getFun(double x)
    {
        return x*x*x - 5*x*x + 10*x -80;//被求方程，可以自行修改
    }
}