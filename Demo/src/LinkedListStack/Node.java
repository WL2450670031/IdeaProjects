package LinkedListStack;

public class Node
{
    private String name;
    private int age;
    private String sex;
    private Node next;

    public Node()
    {
        super();
    }

    public Node(String name,int age,String sex)
    {
        this.age = age;
        this.sex = sex;
        this.name = name;
        next = null;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public Node getNext() {
        if(next!=null)
            return next;
        else
            return null;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setNode(Node node)
    {
        name = node.name;
        age = node.age;
        sex = node.sex;
    }

    @Override
    public String toString() {
        return "name=" + name + " "+ "age=" + age+ " " + "sex=" + sex;
    }
}
