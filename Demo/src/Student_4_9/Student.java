package Student_4_9;

public class Student
{
    private String name;
    private int num;
    private String age;

    public Student(){}
    public Student(String name,int num,String age)
    {
        this.name=name;
        this.num=num;
        this.age=age;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String toString()
    {
        return name+num+age;
    }
}
