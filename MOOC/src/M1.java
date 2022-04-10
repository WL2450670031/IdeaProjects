import java.util.Scanner;

//称硬币
public class M1
{
    static String[] Left = new String[3];
    static String[] Right = new String[3];
    static String[] Result = new String[3];

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();

        while((m--)>0)
        {
            for(int i = 0;i<3;i++)
            {
                Left[i] = in.next();
                Right[i] = in.next();
                Result[i] = in.next();
            }
            for(char c = 'A';c<='L';c++)
            {
                if(isFake(c,true))
                {
                    System.out.println(c+"是轻的假币");
                    break;
                }
                else if(isFake(c,false))
                {
                    System.out.println(c + "是重的假币");
                    break;
                }
            }
        }
    }

    public static boolean isFake(char c,boolean light)
    {
        for(int i = 0;i < 3;i++)
        {
            String left;
            String right;
            if(light)//假设硬币是轻的假币
            {
                left = Left[i];
                right = Right[i];
            }
            else
            {
                left = Right[i];
                right = Left[i];
            }

            switch(Result[i])//天平右边的情况
            {
                case "u"://右上
                {
                    if(right.indexOf(c)==-1)
                        return false;
                }break;
                case "e"://平
                {
                    if((left.indexOf(c)!=-1)||(right.indexOf(c)!=-1))
                        return false;
                }break;
                case "d"://右下
                {
                    if(left.indexOf(c)==-1)
                        return false;
                }break;
            }
        }
        return true;
    }
}
