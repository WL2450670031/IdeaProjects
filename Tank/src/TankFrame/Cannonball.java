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
        Color color = Color.BLACK;
        graphics.setColor(color);
        graphics.fillOval(x,y,width,height);
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
