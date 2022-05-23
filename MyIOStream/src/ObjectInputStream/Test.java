package ObjectInputStream;

import ObjectOutputStream.Dog;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//ObjectInputStream的使用，反序列化.
public class Test
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "D:\\MyProgramProjects\\TestFile\\Obj.dat";

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        //1.反序列化的顺序，需要和序列化的顺序一致。
        //否则会出现异常

        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());
        Object o = objectInputStream.readObject();
        System.out.println("类型：" + o.getClass());
        System.out.println(o);

        //如果想要调用Dog 的方法，需要向下转型。
        //需要能够引用Dog类。
        Dog dog1 = (Dog)o;
        System.out.println(dog1);
        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        dog1.setName("二狗");
        System.out.println(dog1.getName());
        objectInputStream.close();
    }
}
