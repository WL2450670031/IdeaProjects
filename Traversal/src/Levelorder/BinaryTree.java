package Levelorder;

import java.util.Scanner;

//二叉树操作

public class BinaryTree
{
    BinaryTreeNode head;//根结点
    int length;//结点数

    Scanner in = new Scanner(System.in);

    public BinaryTree()
    {
        head = null;
        length = 0;
    }

    public void PreCreate(BinaryTreeNode node, int rl)//前序方式创建二叉树
    {
        if(rl == 1)
        {
            System.out.print("其右");
        }
        else if(rl == 0)
        {
            System.out.print("其左");
        }
        else
        {
            System.out.print("根");
        }
        System.out.println("扣1继续输入，扣0返回");
        System.out.print("->");
        if(in.nextInt() == 1)//如果输入数据，那么才进行下一个结点的操作
        {
            BinaryTreeData data = new BinaryTreeData();
            data.setA(in.nextInt());
            node.setData(data);//输入根结点
            length++;
            node.left = new BinaryTreeNode();
            node.right = new BinaryTreeNode();
            PreCreate(node.left,0);//创建左子树
            PreCreate(node.right,1);//创建右子树
        }
    }
}
