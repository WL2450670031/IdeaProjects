package Test1;
//server 实现一个简单的服务器

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * @author 吴乐
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        try(ServerSocket serverSocket = new ServerSocket(8189))
                //监听端口服务器套接字
        {
            try(Socket socket = serverSocket.accept())
            //等待连接,阻塞直至连接,返回一个socket对象，通过这个对象与连接的客户端进行通信
            {
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();

                try(Scanner in = new Scanner(inputStream,"GBK"))
                {
                    PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream, "GBK"),true);

                    printWriter.println("你好，我是吴乐！按 BEY 关闭");

                    boolean done = false;
                    while (!done && in.hasNextLine())
                    {
                        String line = in.nextLine();
                        printWriter.println("->" + line);
                        System.out.println(line);
                        if("bey".equals(line.trim()))
                        {
                            done = true;
                        }
                    }
                    socket.close();//关闭服务器套接字
                }
            }
        }
    }
}
