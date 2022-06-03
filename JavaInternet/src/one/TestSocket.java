package one;

import java.net.InetSocketAddress;

public class TestSocket
{
    public static void main(String[] args)
    {
        InetSocketAddress inetSocketAddress1 = new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress inetSocketAddress2 = new InetSocketAddress("www.baidu.com",8080);
        System.out.println(inetSocketAddress1);
        System.out.println(inetSocketAddress2);

        System.out.println(inetSocketAddress2.getAddress());
        System.out.println(inetSocketAddress2.getHostName());//获取主机名字
        System.out.println(inetSocketAddress2.getPort());//获取端口
    }
}
