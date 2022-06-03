package UDPWechat2;

public class 妹妹
{
    public static void main(String[] args)
    {
        int fromPort = 9999;
        int toPort = 8888;
        int port = 7777;
        String toIP = "127.0.0.1";

        new Thread(new TaskSend(fromPort,toIP,toPort)).start();
        new Thread(new TaskReceive(port)).start();
        //必须互相发送"bye"才能关闭，只有一方发的话，只会导致本地不能发，对方不能收。
    }
}
