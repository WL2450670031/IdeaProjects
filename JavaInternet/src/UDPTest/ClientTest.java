package UDPTest;
//发送端
import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
public class ClientTest
{
    //不需要连接服务器
    public static void main(String[] args) throws IOException
    {
        //1.建立一个Socket
        DatagramSocket socket = new DatagramSocket();

        //2.建立数据包,选择发送目标。
        String msg = "你好，我是吴乐。";//数据
        String IP = "127.0.0.1";//目标地址
        InetAddress localhost = InetAddress.getByName(IP);//发送目标
        int port = 9000;//目标端口

        DatagramPacket packet = new DatagramPacket(msg.getBytes(StandardCharsets.UTF_8),0,msg.getBytes().length,localhost,port);
        //数据，长度起、始，发送目标。

        //3.发送数据包
        socket.send(packet);

        //4.关闭流
        socket.close();
    }
}
