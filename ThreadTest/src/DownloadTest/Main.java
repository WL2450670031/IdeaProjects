package DownloadTest;
//多线程下载
public class Main extends Thread
{

    public static void main(String[] args)
    {
        ThreadTest threadTest1 = new ThreadTest("http://a1.qpic.cn/psc?/V13beHvY1kkpqL/ruAMsa53pVQWN7FLK88i5sz2Hyt.dJb6Hj7dpnpzGHN6.uQig4.EkmPebe9Gy55rsAykyATLD9T*MTScp4TQYitWZJmNcRF.xzLuJvosBpM!/m&ek=1&kp=1&pt=0&bo=QAZRCEAGUQgRECc!&t=5&tl=3&vuin=2450670031&tm=1653483600&dis_t=1653486676&dis_k=09a0bd4a09b19934e64d3275c477a853&sce=60-4-3&rf=0-0","1.jpg");

        threadTest1.start();
    }

}
