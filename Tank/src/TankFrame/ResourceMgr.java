package TankFrame;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

/**
 * @author 吴乐 汉江师范学院
 * 资源管理类，管理坦克样式.
 */
public class ResourceMgr
{
    public static BufferedImage tankLeft;
    public static BufferedImage tankRight;
    public static BufferedImage tankUp;
    public static BufferedImage tankDown;
    public static BufferedImage ballRight;
    public static BufferedImage ballUp;

    static
    {
        try
        {//加载图片
            tankLeft  = ImageIO.read(Objects.requireNonNull(ResourceMgr.class.getClassLoader().getResourceAsStream("Image/left.jpg")));
            tankRight = ImageIO.read(Objects.requireNonNull(ResourceMgr.class.getClassLoader().getResourceAsStream("Image/right.jpg")));
            tankUp    = ImageIO.read(Objects.requireNonNull(ResourceMgr.class.getClassLoader().getResourceAsStream("Image/up.jpg")));
            tankDown  = ImageIO.read(Objects.requireNonNull(ResourceMgr.class.getClassLoader().getResourceAsStream("Image/down.jpg")));
            ballRight = ImageIO.read(Objects.requireNonNull(ResourceMgr.class.getClassLoader().getResourceAsStream("Image/ballRight.jpg")));
            ballUp = ImageIO.read(Objects.requireNonNull(ResourceMgr.class.getClassLoader().getResourceAsStream("Image/ballUp.jpg")));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
