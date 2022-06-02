package FileUpdate;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientTest
{
    public static void main(String[] args) throws IOException
    {
        //1.创建一个Socket连接
        int port = 9000;
        String IP = "127.0.0.1";
        InetAddress inetAddress = InetAddress.getByName(IP);
        Socket socket = new Socket(inetAddress,port);

        //2.创建一个输出流,连接Socket的流
        OutputStream outputStream = socket.getOutputStream();

        //3.读取文件
        String filePath = "C:\\Users\\吴乐\\Pictures\\Camera Roll\\搞怪.mp4";
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);

        //4.输出文件
        byte[] buf = new byte[1024];
        int length;
        while((length = fileInputStream.read(buf)) != -1)
        {
            outputStream.write(buf,0,length);
        }

        //5.关闭资源,先建后关
        fileInputStream.close();
        outputStream.close();
        socket.close();
    }
}
