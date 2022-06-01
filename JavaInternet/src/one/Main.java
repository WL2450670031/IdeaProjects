package one;

import java.net.InetAddress;
import java.net.UnknownHostException;

//测试IP
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress inetAddress1 = InetAddress.getByName("localhost");
//            //查询本机IP地址
//            System.out.println(inetAddress1);
//
  //          InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
//            //查询百度网络IP地址
//            System.out.println(inetAddress2);

            //常用方法
            //System.out.println(inetAddress2.getAddress());
            //System.out.println(inetAddress2.getHostAddress());
            //获得IP
            //System.out.println(inetAddress2.getCanonicalHostName());
            //获得规范的名字
            System.out.println(inetAddress1.getHostName());
            //获取域名，或者本机名字。

        } catch (UnknownHostException e)
        {
            throw new RuntimeException(e);
        }

    }
}
