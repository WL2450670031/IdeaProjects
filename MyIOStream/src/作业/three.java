package 作业;

import java.io.*;
import java.util.Properties;

/**
 * @author 吴乐 汉江师范学院
 */
public class three
{
    public static void main(String[] args) throws IOException
    {
        String filePath = "D:\\MyProgramProjects\\IdeaProjects\\MyIOStream\\src\\作业\\dog";
        Properties properties = new Properties();

        properties.load(new FileReader(filePath));
        //读取配置文件
        Dog dog = new Dog(properties.getProperty("name"),properties.getProperty("age"),properties.getProperty("color"));
        //获取配置
        System.out.println(dog);
    }
}

class Dog
{
    private String name;
    private String age;
    private String color;

    public Dog() {super();}

    public Dog(String name, String age, String color)
    {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}