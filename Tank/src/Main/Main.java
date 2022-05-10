package Main;

import TankFrame.TankFrame;

/**
 * @author 吴乐
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        TankFrame tankFrame = new TankFrame();

        while(true)
        {
            Thread.sleep(10);
            //停10ms
            tankFrame.repaint();
        }
    }
}
