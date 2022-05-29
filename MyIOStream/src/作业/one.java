package 作业;

import java.io.File;
import java.io.IOException;

/**
 * @author 吴乐 汉江师范学院
 */
public class one
{
    public static void main(String[] args) throws IOException
    {
        String directoryPath = "D:\\helloWord";
        String filePath = "D:\\helloWord\\hello.txt";
        createDirectory(directoryPath,filePath);
    }

    public static boolean createDirectory(String directoryPath,String filePath) throws IOException
    {
        File directory = new File(directoryPath);
        File file = new File(filePath);

        //创建文件对象
        if(directory.exists())
        {
            if(directory.isDirectory())
            {
                System.out.println("该文件夹已经存在，路径：" + directoryPath);
                if (!file.exists())
                {
                    file.createNewFile();
                    System.out.println("已经创建文件，路径：" + filePath);
                }
                else
                {
                    System.out.println("该文件已经存在，路径：" + filePath);
                    return false;
                }
            }
            else
            {
                directory.mkdir();
                System.out.println("已经创建文件夹，路径：" + directoryPath);
                file.createNewFile();
                System.out.println("已经创建文件，路径：" + filePath);
            }
        }
        else
        {
            directory.mkdir();
            System.out.println("已经创建文件夹，路径：" + directoryPath);
            file.createNewFile();
            System.out.println("已经创建文件，路径：" + filePath);
        }
        return true;
    }
}
