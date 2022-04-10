package PrintStudentData_6_5.wule;

public interface I_TableModel
{
    int getRowNumber();
    int getColNumber();
    String getColName(int index);
    Object getValue(int row, int col);
}
