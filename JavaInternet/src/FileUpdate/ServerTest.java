package FileUpdate;

import jdk.internal.util.xml.impl.Input;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest
{
    public static void main(String[] args) throws IOException {
        //1.指定一个端口，提供服务。
        int port = 9000;
        ServerSocket serverSocket = new ServerSocket(port);
        //2.监听客户端连接
        Socket socket = serverSocket.accept();//阻塞式监听，会一直等待客户端连接,连接后才会继续执行代码。
        //3.获取客户端输入流
        InputStream inputStream = socket.getInputStream();
        //4.输出文件
        String filePath = "D:\\搞怪.mp4";
        File file = new File(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] buf = new byte[1024];
        int length;
        int a = 0;
        while((length = inputStream.read(buf))!=-1)
        {
            fileOutputStream.write(buf,0,length);
            a += length;
            System.out.println("已经上传了" + a +"byte");
        }
        System.out.println("上传完毕，文件大小为:" +a+"byte");
        //5.关闭流
        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();


    }
}
