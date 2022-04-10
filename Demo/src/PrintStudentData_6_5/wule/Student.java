package PrintStudentData_6_5.wule;

public class Student {
    int Id;
    String name;
    boolean gender;
    int age;

    public Student(int Id, String name, boolean gender, int age)
    {
        this.Id=Id;
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public boolean getGender()
    {
        return gender;
    }

}
