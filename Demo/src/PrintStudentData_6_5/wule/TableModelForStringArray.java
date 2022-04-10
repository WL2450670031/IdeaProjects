package PrintStudentData_6_5.wule;

public class TableModelForStringArray implements I_TableModel
{
    public String[][] data;

    public TableModelForStringArray(String[][] data)
    {
        this.data=data;
    }

    public int getRowNumber() {
        return data.length-1;
    }

    public int getColNumber()
    {
        return data[0].length;
    }

    public String getColName(int index) {
        return data[0][index];
    }

    public Object getValue(int row, int col) {
        return data[row+1][col];
    }
}

