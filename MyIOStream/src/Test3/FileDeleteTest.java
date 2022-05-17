package Test3;
//文件删除
import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author 吴乐
 */
public class FileDeleteTest
{
    @Test
    public void deleteFile()
    {
        String filePath = "D:\\MyProgramProjects\\TestFile\\1.txt";
        File file = new File(filePath);
        if(file.exists())
        {
            if(file.delete())
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
        else
        {
            System.out.println("null");
        }
    }

    //Java中，目录也被当作文件
    //如果目录里面有目录或者有文件就不能删除

    @Test
    public void deleteDirectory()
    {
        String path = "D:\\MyProgramProjects\\1";
        File file = new File(path);
        if(file.exists())
        {
            if(file.delete())
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
        else
        {
            System.out.println("null");
        }
    }

    //目录不存在就创建

    @Test
    public void  createDirectory()
    {
        String path = "D:\\MyProgramProjects\\1\\2";
        File file = new File(path);
        if(file.exists())
        {
            System.out.println("yes");
        }
        else
        {
            if(file.mkdirs())
            {
                System.out.println("create yes");
            }
            else
            {
                System.out.println("create no");
            }
        }
    }
}

