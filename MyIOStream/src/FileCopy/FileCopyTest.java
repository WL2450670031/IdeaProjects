package FileCopy;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 吴乐
 */
public class FileCopyTest
{
    //将文件读入
    //将文件输出

    @Test
    public void fileCopy() throws IOException {


        String filePath = "C:\\Users\\吴乐\\Pictures\\cwj.jpg";
        String destPath = "C:\\Users\\吴乐\\Pictures\\hello.jpg";

        FileInputStream input = null;
        FileOutputStream output = null;

        int readLength;

        try
        {
            input = new FileInputStream(filePath);
            output = new FileOutputStream(destPath);
            byte[] buf = new byte[1024];
            //使用字节数组，提高效率
            while((readLength = input.read(buf)) != -1)
            {
                //读取后就写入，通过FileOutputStream
                output.write(buf,0,readLength);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {//关闭流
                if (input != null) {
                    input.close();

                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
