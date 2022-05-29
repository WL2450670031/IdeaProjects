package 作业;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *@author 吴乐 汉江师范学院
 *使用BufferedReader流读取一个文本文件，为每行加上行号，连同内容打印到屏幕
 */

public class two
{
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\MyProgramProjects\\IdeaProjects\\MyIOStream\\src\\作业\\two.java";
        bufferedReader(filePath);
    }
    public static void bufferedReader(String filePath) throws IOException
    {
        String line;
        int i = 1;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        while(true)
        {
            line = bufferedReader.readLine();
            if(line == null)
            {
                break;
            }
            //字符读取完毕,结束程序.
            System.out.print(i++ + "  ");
            System.out.println(line);
            //输出结果
        }
        bufferedReader.close();
    }
}
