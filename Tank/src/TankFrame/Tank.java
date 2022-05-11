package TankFrame;

import java.awt.*;

/**
 * @author 吴乐
 */
public class Tank
{
    int x;
    int y;
    int speed;
    Dir dir;
    CAMP camp;
    boolean moving = false;
    TankFrame tankFrame;
    boolean live;

    public Tank()
    {
        super();
    }

    public Tank(int x, int y, int speed, Dir dir,CAMP camp, TankFrame tankFrame)
    {
        super();
        live = true;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.dir = dir;
        this.tankFrame = tankFrame;
        this.camp = camp;
    }

    public void paint(Graphics graphics)
    {
        if(!live)
        {
            camp = null;
            dir = null;
            graphics.drawString("游戏结束",this.x,this.y);
            return;
        }
        switch(dir)
        {
            case LEFT:
                graphics.drawImage(ResourceMgr.tankLeft,x,y,null);
                break;
            case RIGHT:
                graphics.drawImage(ResourceMgr.tankRight,x,y,null);
                break;
            case UP:
                graphics.drawImage(ResourceMgr.tankUp,x,y,null);
                break;
            case DOWN:
                graphics.drawImage(ResourceMgr.tankDown,x,y,null);
                break;
            default:break;
        }
        //x,y,宽，高.向右x，向下y
        //窗口出来时调用以此，以后，每次被盖住后，再出来，又会调用。
        move();
    }

    private void move()
    {
        if(!moving)
        {
            return;
        }
        switch(dir)
        {
            case LEFT:x -= speed;break;
            case RIGHT:x += speed;break;
            case UP:y -= speed;break;
            case DOWN:y += speed;break;
            default:break;
        }
    }

    public void fire()
    {
        if(live)
        {
            tankFrame.cannonballs.add(new Cannonball(this.x, this.y, this.dir, camp, this.tankFrame));
        }
    }

    public void setMoving(boolean moving)
    {
        this.moving = moving;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setDir(Dir dir)
    {
        this.dir = dir;
    }
}
