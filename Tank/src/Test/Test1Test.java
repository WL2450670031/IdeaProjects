package Test;
//方法测试，加载图片
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
/**
 * @author 吴乐
 */
class Test1Test
{
    @Test
    void test()
    {
        try
        {
            BufferedImage image = ImageIO.read(new File("C:/Users/吴乐/Pictures/cwj.jpg"));
            /*
            用这种方法读取图片会有很大的局限性，
            用这种写死了的文件不方便，要求用户电脑同样的路径也有该图片。
             */
            assertNotNull(image);

            BufferedImage image1 = ImageIO.read(Objects.requireNonNull(Test1Test.class.getClassLoader().getResourceAsStream("Image/cwj.jpg")));
            //找文件直接去classpath找
            assertNotNull(image1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
