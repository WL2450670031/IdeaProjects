package BufferedOutputStreamCopy;
//复制照片和视频都成功了。
//利用字节流复制二进制文件
import java.io.*;
import java.util.function.BooleanSupplier;

/**
 * @author 吴乐
 */
public class Test
{
    @org.junit.jupiter.api.Test
    public void copy() throws IOException {
        String srcPath = "C:\\Users\\吴乐\\Pictures\\Camera Roll\\搞怪.mp4";
        String destPath = "C:\\Users\\吴乐\\Pictures\\Camera Roll\\hhh.mp4";

        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;

        try
        {
            inputStream = new BufferedInputStream(new FileInputStream(srcPath));
            outputStream = new BufferedOutputStream(new FileOutputStream(destPath));

            byte[] buf = new byte[1024];
            int readLen = 0;

            while((readLen = inputStream.read(buf)) != -1)
            {
                outputStream.write(buf,0,readLen);
                //读多少，写多少.
            }
            System.out.println("true!");
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }finally
        {
            if(inputStream != null)
            {
                inputStream.close();
            }
            if(outputStream != null)
            {
                outputStream.close();
            }
        }
    }

}
