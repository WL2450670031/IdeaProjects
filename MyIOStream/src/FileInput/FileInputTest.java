package FileInput;
//从文件读取数据
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 吴乐
 */
public class FileInputTest
{
    @Test
    public void readFile1() throws IOException {
        FileInputStream inputStream = null;
        int readData;
        int readLength;
        byte[] buf = new byte[8];
        //一次读取8个字节
        String path = "D:\\MyProgramProjects\\TestFile\\2.txt";
        try
        {
            inputStream = new FileInputStream(path);
            //指定文件
            while((readData = inputStream.read() )!= -1)
            //返回一个字节.
            {
                System.out.print((char)readData);
            }
            //使用read(byte[])可以提高效率
            while((readLength = inputStream.read(buf)) != -1)
            {//返回-1表示已经到底结尾
                //读取正常则返回实际读取长度
                System.out.print(new String(buf,0,readLength));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally
        {
            inputStream.close();
            //关闭流,释放资源
        }
    }
}
