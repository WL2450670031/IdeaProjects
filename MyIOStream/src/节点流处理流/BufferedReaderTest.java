package 节点流处理流;
//处理流
/**
 * @author 吴乐
 */
public class BufferedReaderTest extends ReaderTest
{
    private final ReaderTest readerTest;
    //可以接受ReaderTest的子类对象，实现很多操作。


    public BufferedReaderTest(ReaderTest readerTest)
    {
        this.readerTest = readerTest;
    }
    //让方法更加灵活，多次读取文件

    public void readFile()//封装一层
    {
        readerTest.readFile();
    }

    public void readFiles(int num)
    {
        for(int i = 0;i < num;i++)
        {
            readFile();
        }
    }

    //扩展readString，批量处理字符串

    public void readStrings(int num)
    {
        for(int i = 0;i < num;i++)
        {
            readerTest.readString();
        }
    }
}
