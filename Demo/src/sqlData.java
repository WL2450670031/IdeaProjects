import java.util.Arrays;
import java.util.Random;

public class sqlData
{
    public static void main(String[] args)
    {
        Random random = new Random();
        long sno;
        char[] name = new char[3];
        //String[] dept = new String[]{"计算机", "数学", "教育", "物理", "生物", "医学", "建筑", "法律", "社会", "心理"};
        int[] birth = new int[3];
        boolean sex;
        for(int i = 0;i < 10;i++)
        {
            System.out.print("(");
            sno = 2020701000+random.nextInt(90)+10;
            System.out.print("'"+sno+"',");

            //65-90,97-122
            name[0] = (char)(random.nextInt(26)+65);
            name[1] = (char)(random.nextInt(26)+97);
            name[2] = (char)(random.nextInt(26)+97);
            System.out.print("'"+ name[0]+""+name[1]+""+name[2] +"',");

            sex = random.nextBoolean();
            System.out.print("'"+(sex?"男":"女")+"',");

            birth[0] = random.nextInt(10)+1990;
            birth[1] = random.nextInt(12)+1;
            if(birth[1]==1||birth[1]==3||birth[1]==5||birth[1]==7||birth[1]==8||birth[1]==10||birth[1]==12)
                birth[2] = random.nextInt(31)+1;
            else if(birth[1]==4||birth[1]==6||birth[1]==9||birth[1]==11)
                birth[2] = random.nextInt(30)+1;
            else birth[2] = random.nextInt(28)+1;
            System.out.print("'"+birth[0]+""+birth[1]+""+birth[2]+"',");

            System.out.print("'"+"生物"+"'");

            System.out.print("),");
            System.out.println();
        }
    }
}
