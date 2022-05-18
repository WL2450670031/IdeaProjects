package OutputFile;
//将数据写入文件

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author 吴乐
 */
public class OutputFileTest
{
    @Test
    public void writeFile() throws IOException {
        String path = "D:\\MyProgramProjects\\TestFile\\3.txt";
        FileOutputStream fileOutputStream = null;

        try
        {
            fileOutputStream = new FileOutputStream(path);
            //创建方式为覆盖原来内容
            fileOutputStream.write('H');
            //方法1 write(),写入字符
            String s = "Hello Java!";
            fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
            //方法2 write(byte[]),写入字节数组
            //getBytes();可以把字符串变成字节数组
            fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8),0,s.length());
            //方法3 write(byte[],int off,int len),将byte[] 将len个字节从起始下标位置为off的指定字节数组写入文件输出流
            fileOutputStream = new FileOutputStream(path,true);
            //不覆盖文件原来的内容,而是接在原来内容的后面
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally
        {
            fileOutputStream.close();
        }
    }
}
