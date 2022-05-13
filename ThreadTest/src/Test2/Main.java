package Test2;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author 吴乐
 */
public class Main extends JFrame
{
    private JLabel jLabel1 = new JLabel();
    private static Thread thread;
    private int count = 0;
    private Container container = getContentPane();

    public Main()
    {
        setBounds(300,200,250,100);

        container.setLayout(null);

        URL url = Main.class.getResource("/Image/ballRight.jpg");

        Icon icon = new ImageIcon(url);

        jLabel1.setIcon(icon);

        jLabel1.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel1.setBounds(10,10,200,50);
        jLabel1.setOpaque(true);

        thread = new Thread(() -> {
            while(count <= 200)
            {
                jLabel1.setBounds(count,10,200,50);
                count += 4;
                if(count == 200)
                {
                    count = 10;
                }
            }
        });
        thread.start();
        container.add(jLabel1);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new Main();
    }
}
