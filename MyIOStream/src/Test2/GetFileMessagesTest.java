package Test2;
//获取文件信息

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author 吴乐
 */
public class GetFileMessagesTest
{
    /*
    1.getName()文件名
    2.getAbsolutePath()绝对路径
    3.getParent()父级目录
    4.length()字节长度
    5.exists()文件是否存在
    6.ifFile()是不是文件
    7.isDirectory()是不是一个目录
     */

    @Test
    public void info()
    {
        File file = new File("D:\\MyProgramProjects\\TestFile\\3.txt");
        //先创建文件对象
        System.out.println("文件名字:" + file.getName());
        //获取文件名
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件父级目录："+ file.getParent());
        System.out.println("文件大小：" + file.length());
        System.out.println("文件是否存在:" + file.exists());
        System.out.println("是不是文件：" + file.isFile());
        System.out.println("是不是目录：" + file.isDirectory());
    }
}
