package LinkedListBinaryTree;

public class Node
{
    Data data;//数据域
    Node left;//左子树
    Node right;//右子树

    public Node()
    {
        super();
    }

    public Node(Data data)
    {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
