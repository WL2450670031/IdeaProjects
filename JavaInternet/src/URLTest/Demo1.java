package URLTest;

import java.net.MalformedURLException;
import java.net.URL;

public class Demo1
{
    public static void main(String[] args) throws MalformedURLException
    {
        String path = "http://localhost:8080/hello/index.jsp?username=root&password=123456";
        URL url = new URL(path);
        System.out.println(url.getProtocol());//得到协议名,http
        System.out.println(url.getPort());//得到端口,8080
        System.out.println(url.getHost());//得到主机IP,localhost
        System.out.println(url.getPath());//得到文件地址,/hello/index.jsp
        System.out.println(url.getFile());//得到全路径, /hello/index.jsp?username=root&password=123456
        System.out.println(url.getQuery());//得到参数,username=root&password=123456
    }
}
