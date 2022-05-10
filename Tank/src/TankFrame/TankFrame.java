package TankFrame;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 吴乐
 */
public class TankFrame extends Frame
{
    final static int FRAME_WIDTH = 800;
    final static int FRAME_HEIGHT = 600;
    int x = 200;
    int y = 200;
    private final static int TANK_SPEED = 5;
    //移动速度

    Dir dir = Dir.UP;

    Tank tank = new Tank(x,y, TANK_SPEED,dir,this);

    EnemyTank enemy1 = new EnemyTank();
    List<Cannonball> cannonballs = new ArrayList<>();
    boolean left = false;
    boolean right = false;
    boolean up = false;
    boolean down = false;

    public TankFrame()
    {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        //窗口大小
        setResizable(false);
        //是否能改变大小
        setTitle("tank!");
        //标题
        setVisible(true);

        addKeyListener(new Listener());
        //键盘监听器

        addWindowListener(
                //窗口事件监听器
            new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);//点x关闭窗口
                }
            }
        );
    }

    Image image = null;
    @Override
    public void update(Graphics graphics)//repaint在调用paint之前会调用update.
    {//消除了闪烁，先加载图片到内存，再将图片打印出来.(原先是直接打印)
        if(image == null)
        {
            image = this.createImage(FRAME_WIDTH, FRAME_HEIGHT);
        }
        Graphics g = image.getGraphics();
        Color color = g.getColor();
        g.setColor(Color.white);
        g.fillRect(0,0, FRAME_WIDTH, FRAME_HEIGHT);
        g.setColor(color);
        paint(g);
        graphics.drawImage(image,0,0,null);
    }

    @Override

    /**
     *<p>画笔告诉编译器：下面的方法是重写的方法,不写也行，最好写上，这样没有名字写错会报错，没有重写的方法会提示。
     *系统自动调用，系统给的画笔</p>
     */
    public void paint(Graphics graphics)
    {
        graphics.drawString("子弹数量为:" + cannonballs.size(),10,60);

        tank.paint(graphics);
        enemy1.paint(graphics);
        for(int i = 0;i < cannonballs.size();i++)
        {
            cannonballs.get(i).paint(graphics);
        }
        //使用下面这个循环的话：里面的迭代器打印，加上Cannonball的删除会报错，会发生越界
//        for (Cannonball value : cannonballs)
//        {
//            value.paint(graphics);
//        }
    }
    class Listener extends KeyAdapter//处理键盘事件的类
    {
        @Override
        public void keyPressed(KeyEvent keyEvent)//一个键被按下的时候调用
        {
            int key = keyEvent.getKeyCode();

            switch(key)
            {
                case KeyEvent.VK_LEFT:
                    left = true;
                    break;
                case KeyEvent.VK_UP:
                    up = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    right = true;
                    break;
                case KeyEvent.VK_DOWN:
                    down = true;
                    break;
                case KeyEvent.VK_SPACE:
                    tank.fire();
                    break;
                default:break;
            }

            setTankDir();
            //默认调用paint方法.可以起到刷新的作用
            //paint方法不能直接调用，因为画笔只有系统给，不能给系统.
        }

        @Override
        public void keyReleased(KeyEvent keyEvent)//按下一个键抬起的时候调用
        {
            int key = keyEvent.getKeyCode();

            switch(key)
            {
                case KeyEvent.VK_LEFT:
                    left = false;
                    break;
                case KeyEvent.VK_UP:
                    up = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    right = false;
                    break;
                case KeyEvent.VK_DOWN:
                    down = false;
                    break;
                default:break;
            }
            setTankDir();
        }
    }

    public void setTankDir()
    {
        if(!(left || right ||up ||down))
        {
            tank.setMoving(false);
        }
        else
        {
            tank.setMoving(true);
            if(left)
            {
                tank.setDir(Dir.LEFT);
            }
            if(right)
            {
                tank.setDir(Dir.RIGHT);
            }
            if(up)
            {
                tank.setDir(Dir.UP);
            }
            if(down)
            {
                tank.setDir(Dir.DOWN);
            }
        }
    }

}


