package PropertiesTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test
{
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\MyProgramProjects\\IdeaProjects\\MyIOStream\\src\\PropertiesTest\\sql"));
//        //读取properties文件，得到ip、密码、用户名。
//        String line;
//        while((line = bufferedReader.readLine()) != null)
//        {
//            String[] strings = line.split("=");
//            System.out.println(strings[0] +"值为："+strings[1]);
//        }
        //麻烦，不如使用properties类.
        Properties properties = new Properties();
        properties.load(new FileReader("D:\\MyProgramProjects\\IdeaProjects\\MyIOStream\\src\\PropertiesTest\\sql"));
        properties.list(System.out);

    }
}

