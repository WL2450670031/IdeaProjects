package R21;

import LinkedList.Linked_Data;
import LinkedList.Linked_List;

public class Main {
    public static void main(String[] args)
    {
        Linked_List head = new Linked_List();
        Linked_Data data = new Linked_Data(10);
        head.set_Linked_List(5);//建立5个数据的链表，结点数为6
        head.add_Data(data,3);//在第3个结点后插入数据
        head.delete_Data(1);//删除第1个数据
        head.update(data,1);//更新第1个数据
        System.out.println(head.get_data(4));//输出第4个数据
        head.print_All();//输出所有数据
    }
}
