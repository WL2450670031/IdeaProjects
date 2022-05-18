package FileReader;

import org.junit.jupiter.api.Test;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 吴乐
 */
public class FileReaderTest
{
    @Test
    public void fileReadTest1() throws IOException {
        String filePath = "D:\\MyProgramProjects\\TestFile\\2.txt";
        FileReader fileReader = null;
        int data = 0;

        try
        {
            fileReader = new FileReader(filePath);
            while((data = fileReader.read()) != -1)
            {//读取文件全部内容
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally
        {
            if(fileReader != null)
            {
                fileReader.close();
            }
        }
    }

    @Test
    public void fileReadTest2() throws IOException
    {//打印自己
        String filePath = "D:\\MyProgramProjects\\IdeaProjects\\MyIOStream\\src\\FileReader\\FileReaderTest.java";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];

        try {
            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(buf)) != -1)
            {//读取文件全部内容
                System.out.print(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
