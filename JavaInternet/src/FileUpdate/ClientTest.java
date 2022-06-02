package FileUpdate;

import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;
import com.sun.xml.internal.bind.v2.runtime.output.UTF8XmlOutput;
import sun.text.normalizer.UTF16;

import java.io.*;
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

        //5.确定服务器接受完毕才端口连接。
        socket.shutdownOutput();//通知服务器上传完毕
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buf2 = new byte[1024];
        int length2;
        while((length2 = inputStream.read(buf2)) != -1)
        {
            byteArrayOutputStream.write(buf2,0,length2);
        }
        System.out.println(byteArrayOutputStream);
        //5.关闭资源,先建后关
        byteArrayOutputStream.close();
        fileInputStream.close();
        outputStream.close();
        socket.close();
    }
}
