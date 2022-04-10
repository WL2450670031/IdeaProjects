package PrintStudentData_6_5.wule;

public class TableModelForStudentArray implements I_TableModel
{
    public Student[] data;

    public TableModelForStudentArray(Student[] data)
    {
        this.data=data;
    }

    public String getColName(int index)
    {
        switch(index)
        {
            case 0:return "ID";
            case 1:return "NAME";
            case 2:return "GENDER";
            case 3:return "AGE";
        }
        return null;
    }

    public int getColNumber()
    {
        return 4;//指定列数
    }

    public int getRowNumber()
    {
        return data.length;
    }

    public Object getValue(int row,int col)
    {
        switch(col)
        {
            case 0:return data[row].getId();
            case 1:return data[row].getName();
            case 2:return data[row].getGender()?"男":"女";
            case 3:return data[row].getAge();
        }
        return null;
    }
}
