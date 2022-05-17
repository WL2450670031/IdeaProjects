package Test1;
//创建文件
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
/**
 * @author 吴乐
 */
public class Main1Test
{
    //方式1 new File（String pathName);

    @Test
    public void createNew1()
    {
        String filePath = "D:\\MyProgramProjects\\TestFile\\1.txt";
        File file = new File(filePath);

        try
        {
            System.out.println(file.createNewFile());
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

    //方式2 new File(File parent，String child）

    @Test
    public void createFile2()
    {
        File parentPath = new File("D:\\MyProgramProjects\\TestFile");
        String fileName = "2.txt";
        File file = new File(parentPath,fileName);
        //创建文件对象

        try
        {
            file.createNewFile();
            //将文件创建到硬盘
            System.out.println("yes!");
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    //方式3 new File（String parent，String child

    @Test
    public void createNew3()
    {
        String parentPath = "D:\\MyProgramProjects\\TestFile";
        String fileName = "3.txt";

        File file = new File(parentPath,fileName);

        try
        {
            file.createNewFile();
            System.out.println("yes!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
