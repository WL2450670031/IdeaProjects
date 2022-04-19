package Levelorder;

//二叉树结点

public class BinaryTreeNode
{
    BinaryTreeData data;//数据域
    BinaryTreeNode left;//左子树
    BinaryTreeNode right;//右子树

    public BinaryTreeNode()
    {
        super();
    }
    public BinaryTreeData getData() {
        return data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setData(BinaryTreeData data) {
        this.data = data;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return data +" left->" + left.data + data + " right->" + right.data;
    }
}
