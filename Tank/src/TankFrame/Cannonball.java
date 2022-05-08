package TankFrame;

import java.awt.*;

public class Cannonball
{

    final static int SPEED = 10;
    int x;
    int y;
    Dir dir;
    static int width = 50;
    static int height = 50;
    Tank_Frame tank_frame;
    boolean live;
    public Cannonball(int x,int y,Dir dir,Tank_Frame tank_frame)
    {
        live = true;
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tank_frame = tank_frame;
    }

    public void paint(Graphics graphics)
    {
        if(!live)
        {
            tank_frame.cannonballs.remove(this);
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
        }
        if(x < 0||y < 0||x > tank_frame.getWidth()|| y >tank_frame.getHeight())
        {
            live = false;
        }
        if(Math.abs(tank_frame.enemy1.x-x) <= 50 && Math.abs(tank_frame.enemy1.y-y) <= 50)
        {
            live = false;
            tank_frame.enemy1.live = false;
        }
    }
}
