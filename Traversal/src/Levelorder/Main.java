package Levelorder;
/*
二叉树层序遍历
吴乐 汉江师范学院 数计学院 2022.4.17
 */
public class Main
{
    public static void main(String[] args)
    {
        BinaryTree binaryTree = new BinaryTree();

        BinaryTreeNode binary = new BinaryTreeNode();
        binaryTree.PreCreate(binary,2);//建立二叉树

        level(binary);
    }

    public static void level(BinaryTreeNode tree)
    {
        LinkQueue linkQueue = new LinkQueue();
        BinaryTreeNode binaryTreeNode;

        if(tree.data != null)//如果二叉树不为空,则进行下一步
        {
            linkQueue.addData(new LinkedNode(tree));//二叉树根结点入队

            System.out.println("当输入一个结点时，程序会要求继续输入该结点的左右孩子,\n然后扣0不输入左孩子，再扣0不输入右孩子");

            while(linkQueue.length != 0)
            {
                binaryTreeNode = linkQueue.getData().getQueueData();//从队列取出一个结点

                System.out.println(binaryTreeNode);//输出出队的结点

                //访问其左右孩子
                if(binaryTreeNode.left.data != null) linkQueue.addData(new LinkedNode(binaryTreeNode.left));
                if(binaryTreeNode.right.data != null) linkQueue.addData(new LinkedNode(binaryTreeNode.right));
            }
        }
    }
}
