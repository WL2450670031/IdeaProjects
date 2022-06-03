package UDPWechat2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TaskSend implements Runnable
{
    DatagramSocket socket;
    BufferedInputStream reader;
    int fromPort;//本地
    String toIP;//目标IP
    int toPort;//目标端口

    public TaskSend(int fromPort, String toIP, int toPort)//初始化
    {
        this.fromPort = fromPort;
        this.toIP = toIP;
        this.toPort = toPort;

        try
        {
            socket = new DatagramSocket(fromPort);
            //开放端口
            reader = new BufferedInputStream(System.in);
            //读取数据
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                byte[] buf = new byte[1024];
                int len = reader.read(buf,0,buf.length);
                DatagramPacket packet = new DatagramPacket(buf,0,len,new InetSocketAddress(toIP,toPort));
                //指定发送目标
                socket.send(packet);
                //发送数据

                if (new String(packet.getData(),0,packet.getLength()).trim().equals("bye"))
                {//关闭
                    break;
                }
            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }

        try
        {
            reader.close();
            //关闭流
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
