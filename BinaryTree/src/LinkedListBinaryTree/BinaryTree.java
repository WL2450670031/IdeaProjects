package LinkedListBinaryTree;

import java.util.Scanner;

public class BinaryTree
{
    Node head;//根结点
    int length;//结点数

    Scanner in = new Scanner(System.in);

    public BinaryTree()
    {
        super();
    }

    public void PreCreate( Node node,boolean rl)//前序方式创建二叉树
    {
        if(rl)
        {
            System.out.print("右,");
        }
        else
        {
            System.out.print("左,");
        }
        System.out.println("扣1输入，否则置空");
        System.out.print("->");
        if(in.nextInt() == 1)//如果输入数据，那么才进行下一个结点的操作
        {
            node.data.setA(in.nextInt());
            PreCreate(head.left,false);
            PreCreate(head.right,true);
        }
    }
}
