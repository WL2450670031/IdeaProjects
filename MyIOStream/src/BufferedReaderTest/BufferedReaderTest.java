package BufferedReaderTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 吴乐
 */
public class BufferedReaderTest
{
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\MyProgramProjects\\TestFile\\buffered.txt";
        //创建bufferedReader.
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        //按行读取效率高
        //1.readLine()
        //2.返回null时,表示读取完毕
        while((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
        }

        //关闭流，只需关闭Buffered,因为底层会自动关闭节点流
        bufferedReader.close();
    }
}
