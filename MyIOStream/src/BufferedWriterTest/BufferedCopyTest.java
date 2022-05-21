package BufferedWriterTest;

//BufferedReader和BufferedWriter是安装字符操作
//尽量不要用来操作二进制文件(声音，视频或者PDF)，容易造成文件损坏
import java.io.*;

/**
 * @author 吴乐
 */
public class BufferedCopyTest
{
    public static void main(String[] args) throws IOException {
        String srcPath = "D:\\MyProgramProjects\\TestFile\\writer.txt";
        String destPath = "D:\\MyProgramProjects\\TestFile\\5.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line;
        try
        {
            bufferedReader = new BufferedReader(new FileReader(srcPath));
            bufferedWriter = new BufferedWriter(new FileWriter(destPath));

            while((line = bufferedReader.readLine())!= null)
            {
                bufferedWriter.write(line);
                //每读取一行就写入
                bufferedWriter.newLine();
                //换行.
            }
            System.out.println("复制完毕");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally
        {
            bufferedReader.close();
            bufferedWriter.close();
        }

    }
}

