package Levelorder;

public class LinkedNode
{
    private BinaryTreeNode data;
    private LinkedNode next;

    public LinkedNode()
    {
        super();
    }

    public LinkedNode(BinaryTreeNode data)
    {
        this.data = data;
    }

    public BinaryTreeNode getQueueData() {
        return data;
    }

    public void setQueueData(BinaryTreeNode data) {
        this.data = data;
    }

    public LinkedNode getQueueNext() {
        return next;
    }

    public void setQueueNext(LinkedNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "data=" + data;
    }
}
