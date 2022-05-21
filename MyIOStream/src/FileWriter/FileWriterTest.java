package FileWriter;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 吴乐
 */
public class FileWriterTest
{
    @Test
    public void fileWriter() throws IOException {
        File file = new File("D:\\MyProgramProjects\\TestFile\\4.txt");
        String path = "D:\\MyProgramProjects\\TestFile\\4.txt";
        FileWriter fileWriter = null;
        char[] a = new char[10];
        a = "abcdefg".toCharArray();
        try
        {
            fileWriter = new FileWriter(file);
            fileWriter.write(99);
            //write(int)
            fileWriter.write('a');
            //write(char)
            fileWriter.write(a);
            //write(char[])
            fileWriter.write("hijklmn");
            //write(String)
        } catch (IOException e) {
            e.printStackTrace();
        }finally
        {
            fileWriter.close();
        }

    }
}
