package TankFrame;

import java.awt.*;

/**
 * @author 吴乐
 */
public class Cannonball
{

    final static int SPEED = 5;
    int x;
    int y;
    Dir dir;
    CAMP camp;
    TankFrame tankFrame;
    boolean live;
    public Cannonball(int x, int y, Dir dir,CAMP camp, TankFrame tankFrame)
    {
        live = true;
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tankFrame = tankFrame;
        this.camp = camp;
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
    }

    public void kill(Tank tank)
            //与坦克比较距离，如果碰到了，就判断是敌方就杀掉。
    {

        Rectangle rectangle1 = new Rectangle(this.x,this.y,50,50);
        Rectangle rectangle2 = new Rectangle(tank.x,tank.y,50,50);
        if(rectangle1.intersects(rectangle2) && this.camp != tank.camp)
        {
            tank.live = false;
            this.live = false;
        }
    }
}
