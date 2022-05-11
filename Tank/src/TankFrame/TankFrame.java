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
    private final static int TANK_SPEED = 3;
    int tanksNumber = 2;
    //移动速度
    
    Tank[] tanks =
            {
                    new Tank(100,100, TANK_SPEED,Dir.UP,CAMP.WE,this),
                    //1号坦克
                    new Tank(x,y, TANK_SPEED,Dir.DOWN,CAMP.ENEMY,this)
                    //2号坦克
            };
    List<Cannonball> cannonballs = new ArrayList<>();

    boolean left1 = false;
    boolean right1 = false;
    boolean up1 = false;
    boolean down1 = false;
//支持1号坦克移动

    boolean left2 = false;
    boolean right2 = false;
    boolean up2 = false;
    boolean down2 = false;
//支持2号坦克移动

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

    /**
     *告诉编译器：下面的方法是重写的方法,不写也行，最好写上，这样名字写错会报错，没有重写的方法会提示。
     *系统自动调用，
     * @param graphics 系统给的画笔
     */
    @Override
    public void paint(Graphics graphics)
    {
        graphics.drawString("子弹数量为:" + cannonballs.size(),10,60);

        for(int i = 0;i < tanksNumber;i++)
        { //画坦克
            tanks[i].paint(graphics);
        }
        for(int i = 0;i < cannonballs.size();i++)
        {//画子弹
            cannonballs.get(i).paint(graphics);
        }
        for(int i = 0;i < cannonballs.size();i++)
        {
            for(int j = 0;j < tanksNumber;j++)
            {
                cannonballs.get(i).kill(tanks[j]);
                //将每个子弹与坦克比较，如果撞上了，就判断是否为敌方。
            }
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
                //坦克1操作方式
                case KeyEvent.VK_LEFT:
                    left1 = true;
                    break;
                case KeyEvent.VK_UP:
                    up1 = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    right1 = true;
                    break;
                case KeyEvent.VK_DOWN:
                    down1 = true;
                    break;
                case KeyEvent.VK_NUMPAD0:
                    tanks[0].fire();
                    break;
                    //坦克2操作方式
                case KeyEvent.VK_A:
                    left2 = true;
                    break;
                case KeyEvent.VK_W:
                    up2 = true;
                    break;
                case KeyEvent.VK_D:
                    right2 = true;
                    break;
                case KeyEvent.VK_S:
                    down2 = true;
                    break;
                case KeyEvent.VK_SPACE:
                    tanks[1].fire();
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
                    left1 = false;
                    break;
                case KeyEvent.VK_UP:
                    up1 = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    right1 = false;
                    break;
                case KeyEvent.VK_DOWN:
                    down1 = false;
                    break;
                case KeyEvent.VK_NUMPAD0:
                    tanks[0].fire();
                    break;
                case KeyEvent.VK_A:
                    left2 = false;
                    break;
                case KeyEvent.VK_W:
                    up2 = false;
                    break;
                case KeyEvent.VK_D:
                    right2 = false;
                    break;
                case KeyEvent.VK_S:
                    down2 = false;
                    break;
                case KeyEvent.VK_SPACE:
                    tanks[1].fire();
                    break;
                default:
                    break;
            }
            setTankDir();
        }
    }

    public void setTankDir()    //让坦克能动
    {
        if(!(left1 || right1 ||up1 ||down1))
        {
            tanks[0].setMoving(false);
        }
        else
        {
            tanks[0].setMoving(true);
            if(left1)
            {
                tanks[0].setDir(Dir.LEFT);
            }
            if(right1)
            {
                tanks[0].setDir(Dir.RIGHT);
            }
            if(up1)
            {
                tanks[0].setDir(Dir.UP);
            }
            if(down1)
            {
                tanks[0].setDir(Dir.DOWN);
            }
        }
        if(!(left2 || right2 ||up2 ||down2))
        {
            tanks[1].setMoving(false);
        }
        else
        {
            tanks[1].setMoving(true);
            if(left2)
            {
                tanks[1].setDir(Dir.LEFT);
            }
            if(right2)
            {
                tanks[1].setDir(Dir.RIGHT);
            }
            if(up2)
            {
                tanks[1].setDir(Dir.UP);
            }
            if(down2)
            {
                tanks[1].setDir(Dir.DOWN);
            }
        }
    }

}


