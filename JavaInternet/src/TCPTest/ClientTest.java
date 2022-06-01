package TCPTest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
//客户端
public class ClientTest
{
    public static void main(String[] args)
    {
        Socket socket = null;
        OutputStream outputStream = null;
        try
        {
            //1.知道服务器地址,port
            //InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            //2.创建Socket连接
            socket = new Socket("127.0.0.1",port);
            //3.发送消息，io流
            outputStream = socket.getOutputStream();
            outputStream.write("你好，我是吴乐".getBytes(StandardCharsets.UTF_8));
        }catch (IOException e)
        {
            throw new RuntimeException(e);
        }finally
        {
            if (outputStream != null)
            {
                try {
                    outputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (socket != null)
            {
                try {
                    socket.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
