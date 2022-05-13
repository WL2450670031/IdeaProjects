package Test3;

import java.net.InetAddress;

/**
 * @author 吴乐
 */
public class Main3
{
    public static void main(String[] args)
            throws Exception
    {
        InetAddress ip=InetAddress.getByName("8.130.55.13");
        // 根据主机名来获取对应的InetAddress实例

        System.out.println("是否可达：" + ip.isReachable(200));
        // 判断是否可达

        System.out.println(ip.getHostAddress());
        // 获取该InetAddress实例的IP字符串
        InetAddress local=InetAddress.getByAddress(
                // 根据原始IP地址来获取对应的InetAddress实例
                new byte[]{127,0,0,1});
        System.out.println("本机是否可达：" + local.isReachable(5000));

        System.out.println(local.getCanonicalHostName());
        // 获取该InetAddress实例对应的全限定域名
    }

}
