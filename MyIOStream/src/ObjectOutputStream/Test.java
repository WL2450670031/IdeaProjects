package ObjectOutputStream;

import java.io.*;
//演示ObjectOutputStream的使用，完成数据的序列化。
public class Test
{
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\MyProgramProjects\\TestFile\\Obj.dat";
        //序列化后，保存的文件格式，不是存文本，而是按格式存
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath));

        outputStream.writeInt(100);
        //int->Integer(实现了Serializable)
        outputStream.writeBoolean(true);
        //boolean->Boolean(实现了Serializable)
        outputStream.writeChar('a');
        //char->Character(实现了Serializable)
        outputStream.writeDouble(9.5);
        //double->Double(实现了Serializable)
        outputStream.writeUTF("吴乐");
        //String
        outputStream.writeObject(new Dog("来福",5));

        outputStream.close();
        System.out.println("完毕...");
    }
}

