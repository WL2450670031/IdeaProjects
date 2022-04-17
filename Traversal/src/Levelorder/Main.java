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
        binaryTree.PreCreate(binary,2);

        level(binary);
    }

    public static void level(BinaryTreeNode tree)
    {
        LinkQueue linkQueue = new LinkQueue();
        BinaryTreeNode binaryTreeNode;

        if(tree.data != null)
        {
            linkQueue.addData(new LinkedNode(tree));
            while(linkQueue.length != 0)
            {
                binaryTreeNode = linkQueue.getData().getQueueData();
                System.out.print(binaryTreeNode);
                if(binaryTreeNode.left != null) linkQueue.addData(new LinkedNode(binaryTreeNode.left));
                if(binaryTreeNode.right != null) linkQueue.addData(new LinkedNode(binaryTreeNode.right));
            }
        }
    }
}
