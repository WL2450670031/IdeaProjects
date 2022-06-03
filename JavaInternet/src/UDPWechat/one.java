package UDPWechat;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

public class one
{
    public static void main(String[] args) throws IOException {
        //开放接口
        DatagramSocket socket = new DatagramSocket(6666);
        InetAddress two = InetAddress.getByName("localhost");
        int port = 8888;
        //打印流

        BufferedInputStream reader = new BufferedInputStream(System.in);
        //准备数据,读取System.in
        while (true)
        {
//            String line;
//            line = reader.toString();
//            //读取输入的数据
//
            byte[] buf = new byte[1024];
            int len = reader.read(buf,0,buf.length);
            DatagramPacket packet = new DatagramPacket(buf,0,len, two, port);
            //指定发送目标

            socket.send(packet);
            //发送数据

            if (Arrays.toString(buf).equals("bye")) {//关闭
                break;
            }
        }
        //关闭流
        reader.close();
        socket.close();
    }
}
