package 节点流处理流;

/**
 * @author 吴乐
 */
public class Test
{
    public static void main(String[] args)
    {
        BufferedReaderTest bufferedReaderTest = new BufferedReaderTest(new FileReaderTest());
        bufferedReaderTest.readFile();
        bufferedReaderTest.readFiles(10);

        BufferedReaderTest bufferedReaderTest1 = new BufferedReaderTest(new StringReaderTest());
        bufferedReaderTest1.readStrings(5);
    }
}

