package LinkedListBinaryTree;

import java.util.Scanner;

public class BinaryTree
{
    Node head;//根结点
    int length;//结点数

    Scanner in = new Scanner(System.in);

    public BinaryTree()
    {
        head = null;
    }

    public void PreCreate( Node node,int rl)//前序方式创建二叉树
    {
        if(rl == 1)
        {
            System.out.print("右,");
        }
        else if(rl == 0)
        {
            System.out.print("左,");
        }
        else
        {
            System.out.print("根,");
        }

        Data data = new Data();
        data.setA(in.nextInt());
        node.setData(data);

        System.out.println("扣1继续输入左右孩子，否则返回上一个结点");
        System.out.print("->");
        if(in.nextInt() == 1)//如果输入数据，那么才进行下一个结点的操作
        {
            node.left = new Node();
            node.right = new Node();
            PreCreate(node.left,0);
            PreCreate(node.right,1);
        }
    }
}
