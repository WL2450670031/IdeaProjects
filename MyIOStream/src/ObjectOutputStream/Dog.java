package ObjectOutputStream;

import java.io.Serializable;

public class Dog implements Serializable//如果要实现序列化某个类的对象，实现Serializable。
{
    private String name;
    private int age;
    //SerializableUID,序列化版本号，可以提高兼容性.
    private static final long serializableUID = 1L;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
