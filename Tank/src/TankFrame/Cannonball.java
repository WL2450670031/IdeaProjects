package TankFrame;

import java.awt.*;

/**
 * @author 吴乐
 */
public class Cannonball
{

    final static int SPEED = 10;
    int x;
    int y;
    Dir dir;
    static int width = 50;
    static int height = 50;
    TankFrame tankFrame;
    boolean live;
    public Cannonball(int x, int y, Dir dir, TankFrame tankFrame)
    {
        live = true;
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tankFrame = tankFrame;

    }

    public void paint(Graphics graphics)
    {
        if(!live)
        {
            tankFrame.cannonballs.remove(this);
        }
        switch(dir)
        {
            case LEFT:
                graphics.drawImage(ResourceMgr.ballRight,x-30,y+17,null);
                break;
            case RIGHT:
                graphics.drawImage(ResourceMgr.ballRight,x+59,y+18,null);
                break;
            case UP:
                graphics.drawImage(ResourceMgr.ballUp,x+19,y-28,null);
                break;
            case DOWN:
                graphics.drawImage(ResourceMgr.ballUp,x+18,y+60,null);
                break;
            default:break;
        }
        move();
    }

    public void move()
    {
        switch(dir)
        {
            case LEFT:x -= SPEED;break;
            case UP:y -= SPEED;break;
            case RIGHT:x += SPEED;break;
            case DOWN:y += SPEED;break;
            default : break;
        }
        if(x < 0||y < 0||x > tankFrame.getWidth()|| y > tankFrame.getHeight())
        {
            live = false;
        }
        if(Math.abs(tankFrame.enemy1.x-x) <= 50 && Math.abs(tankFrame.enemy1.y-y) <= 50)
        {
            live = false;
            tankFrame.enemy1.live = false;
        }
    }
}
