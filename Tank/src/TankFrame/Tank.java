package TankFrame;

import java.awt.*;

public class Tank
{
    int x;
    int y;
     int width = 50;
     int height = 50;
    int speed;
    Dir dir;
    boolean moving = false;
    Tank_Frame tank_frame;
    boolean live;

    public Tank() {
        super();
    }

    public Tank(int x,int y,int speed,Dir dir,Tank_Frame tank_frame)
    {
        super();
        live = true;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.dir = dir;
        this.tank_frame = tank_frame;
    }

    public void paint(Graphics graphics)
    {
        if(!live)
        {
            graphics.drawString("die",100,100);
            return;
        }
        graphics.fillRect(x,y,width,height);//x,y,宽，高.向右x，向下y
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
        tank_frame.cannonballs.add(new Cannonball(this.x,this.y,this.dir,this.tank_frame));
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }
}
