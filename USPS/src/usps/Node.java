package usps;

public class Node
{
    Node next;//下一个结点
    double coefficient;//系数
    double index;//指数

    public Node(){
        super();
    }
    public Node(Node next)
    {
        this.next=next;
    }
    public Node(Node next,double coefficient, double index)
    {
        this.next=next;
        this.coefficient=coefficient;//系数
        this.index=index;//指数
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

