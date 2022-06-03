package UDPWechat2;

public class 哥哥
{
    public static void main(String[] args)
    {
        int fromPort = 6666;
        int toPort = 7777;
        int port = 8888;
        String toIP = "127.0.0.1";

        new Thread(new TaskSend(fromPort,toIP,toPort)).start();
        new Thread(new TaskReceive(port)).start();
    }
}
