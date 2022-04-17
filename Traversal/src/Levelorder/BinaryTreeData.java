package Levelorder;

//二叉树数据域

public class BinaryTreeData
{
    int a;

    public BinaryTreeData()
    {
        super();
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "a=" + a +" ";
    }
}
