package PropertiesTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class Test1
{
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("名字","吴乐");
        properties.setProperty("charset","utf8");
        properties.setProperty("password","12345");

        properties.store(new FileOutputStream("MyIOStream/src/PropertiesTest/sql"),null);
        PrintStream printStream = new PrintStream(System.out);
        printStream.print("保存成功");
    }
}
