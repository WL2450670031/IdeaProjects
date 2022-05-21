package BufferedWriterTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 吴乐
 */
public class BufferedWriterTest
{
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\MyProgramProjects\\TestFile\\writer.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("你妈死了");
        bufferedWriter.newLine();
        bufferedWriter.write("操你妈");
        bufferedWriter.newLine();
        bufferedWriter.write("他妈的");
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
