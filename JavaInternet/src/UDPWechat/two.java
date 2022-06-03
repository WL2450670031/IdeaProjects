package UDPWechat;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class two
{
    public static void main(String[] args) throws IOException
    {
        //开放接口
        DatagramSocket socket = new DatagramSocket(8888);

        /*//准备数据,读取System.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();//读取控制台输入

        //指定发送目标
        byte[] buf = line.getBytes();
        InetAddress two = InetAddress.getByName("localhost");
        int port = 6666;
        DatagramPacket packet = new DatagramPacket(buf,0,buf.length,two,port);


        //发送数据
        socket.send(packet);


        //关闭流
        socket.close();*/
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);
        while(true)
        {
            socket.receive(packet);//阻塞式接收数据

            byte[] bye = packet.getData();
            //获取数据
            String byeData = new String(bye,0,packet.getLength());

            //打印数据

            System.out.println(byeData.trim());
            System.out.println(packet.getAddress());

            if (byeData.trim().equals("bye"))
            {//bye端口断开
                break;
            }
        }

        socket.close();
    }
}
