package PrintStudentData_6_5.wule;

public class PrintTable
{
     public I_TableModel i_tableModel;

     public PrintTable(){
     }
     public PrintTable(I_TableModel i_tableModel)
     {
          this.i_tableModel=i_tableModel;
     }

     public void setModel(I_TableModel i_tableModel)
     {
          this.i_tableModel=i_tableModel;
     }

     public void printTable()
     {
          for(int i=0;i<i_tableModel.getColNumber();i++)
          {
               System.out.print(i_tableModel.getColName(i) + " ");
          }
          System.out.println();
          System.out.println("----------------");
          //输出表格内容
          for(int i=0;i<i_tableModel.getRowNumber();i++)
          {
               for(int j=0;j<i_tableModel.getColNumber();j++)
               {
                    System.out.print(i_tableModel.getValue(i,j)+" ");
               }
               System.out.println();
          }
          System.out.println();
     }

}
