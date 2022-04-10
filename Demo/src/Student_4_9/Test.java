package Student_4_9;
//ÎâÀÖ 2022.1.6
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(java.lang.System.in);
        Student s1 = new Student("Îâ", 20, "ÄĞ");
        Student[] S = new Student[]{s1};
        for(Student a:S)
            System.out.println(a);
    }
}
