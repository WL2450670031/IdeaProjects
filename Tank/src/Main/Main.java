package Main;

import TankFrame.Tank_Frame;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Tank_Frame tank_frame = new Tank_Frame();

        while(true)
        {
            Thread.sleep(10);//停10ms
            tank_frame.repaint();
        }
    }
}
