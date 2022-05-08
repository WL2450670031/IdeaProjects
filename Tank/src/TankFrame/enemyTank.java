package TankFrame;

import java.awt.*;

public class enemyTank extends Tank
{
    public enemyTank()
    {
        x = 100;
        y = 100;
        live = true;
    }
    @Override
    public void paint(Graphics graphics) {
        if(!live)
        {
            graphics.drawString("消灭",this.x,this.y);
            return;
        }
        graphics.fillRect(100,100,50,50);
    }


}
