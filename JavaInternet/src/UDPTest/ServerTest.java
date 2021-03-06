package UDPTest;
//接收端
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//UDP没有服务端的概念
public class ServerTest
{
    public static void main(String[] args) throws IOException
    {
        //1.开放端口
        DatagramSocket socket = new DatagramSocket(9000);

        //2.接收数据包
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf,0,buf.length);

        socket.receive(packet);//阻塞接收
        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(new String(packet.getData(),0,packet.getLength()));

        //3.关闭连接
        socket.close();
    }
}
