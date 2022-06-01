package TCPTest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
//服务端
public class ServerTest
{
    public static void main(String[] args)
    {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream outputStream = null;
        try
        {
            //1.地址
            serverSocket = new ServerSocket(9999);
            //2.等待连接
            socket = serverSocket.accept();
            //3.读取客户端信息,接受客户端的流
            inputStream = socket.getInputStream();

            /*byte[] buf = new byte[1024];
            int len;
            while((len = inputStream.read(buf)) != -1)
            {
                String s = new String(buf,0,len);
                System.out.println(s);
            }*/

            //管道流
            outputStream = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int len;
            while((len = inputStream.read(buf)) != -1)
            {
                outputStream.write(buf,0,len);
            }
            System.out.println(outputStream);
        }catch (IOException e)
        {
            e.printStackTrace();
        }finally
        {
            //关闭资源,先开后关
            if (outputStream != null)
            {
                try
                {
                    outputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (inputStream != null)
            {
                try
                {
                    inputStream.close();
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
            if (serverSocket != null)
            {
                try {
                    serverSocket.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
