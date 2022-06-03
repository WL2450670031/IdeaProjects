package UDPWechat2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TaskReceive implements Runnable
{
    int fromPort;
    DatagramSocket socket;

    public TaskReceive(int fromPort)
    {
        this.fromPort = fromPort;

        try
        {//初始化
            socket = new DatagramSocket(fromPort);
            //开放端口
        } catch (SocketException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);
        while(true)
        {
            try
            {
                socket.receive(packet);//阻塞式接收数据

                byte[] bye = packet.getData();
                //获取数据
                String byeData = new String(bye,0,packet.getLength());

                //打印数据
                System.out.println(packet.getPort()+":"+byeData.trim());

                if (byeData.trim().equals("bye"))
                {//bye端口断开
                    break;
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}
