package PrintStudentData_6_5.wule;

public class Test
{
    public static void main(String[] args)
    {
        Student[] s={
                new Student(1001,"wu",true,20),
                new Student(1002,"liu",true,20),
                new Student(1003,"fang",false,21),
        };
        String[][] str={
                {"ID","NAME","GENDER","AGE"},
                {"1001","wu","ÄÐ","20"},
                {"1002","liu","ÄÐ","20"},
                {"1003","fang","Å®","21"}
        };

        PrintTable table=new PrintTable();

        I_TableModel model=new TableModelForStringArray(str);

        table.setModel(model);
        table.printTable();

        model=new TableModelForStudentArray(s);

        table.setModel(model);
        table.printTable();
    }
}
