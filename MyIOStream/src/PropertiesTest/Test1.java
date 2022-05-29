package PropertiesTest;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Test1
{
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("名字","吴乐");
        properties.setProperty("charset","utf8");
        properties.setProperty("password","12345");

        properties.store(Files.newOutputStream(Paths.get("MyIOStream/src/PropertiesTest/sql")),null);
        PrintStream printStream = new PrintStream(System.out);
        printStream.print("保存成功");
    }
}
