import java.util.Scanner;

//��Ӳ��
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
                    System.out.println(c+"����ļٱ�");
                    break;
                }
                else if(isFake(c,false))
                {
                    System.out.println(c + "���صļٱ�");
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
            if(light)//����Ӳ������ļٱ�
            {
                left = Left[i];
                right = Right[i];
            }
            else
            {
                left = Right[i];
                right = Left[i];
            }

            switch(Result[i])//��ƽ�ұߵ����
            {
                case "u"://����
                {
                    if(right.indexOf(c)==-1)
                        return false;
                }break;
                case "e"://ƽ
                {
                    if((left.indexOf(c)!=-1)||(right.indexOf(c)!=-1))
                        return false;
                }break;
                case "d"://����
                {
                    if(left.indexOf(c)==-1)
                        return false;
                }break;
            }
        }
        return true;
    }
}
