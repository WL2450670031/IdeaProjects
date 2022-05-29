package Callable;
//Callable接口

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        String url = "http://a1.qpic.cn/psc?/V13beHvY1kkpqL/ruAMsa53pVQWN7FLK88i5sz2Hyt.dJb6Hj7dpnpzGHN6.uQig4.EkmPebe9Gy55rsAykyATLD9T*MTScp4TQYitWZJmNcRF.xzLuJvosBpM!/m&ek=1&kp=1&pt=0&bo=QAZRCEAGUQgRECc!&t=5&tl=3&vuin=2450670031&tm=1653483600&dis_t=1653486676&dis_k=09a0bd4a09b19934e64d3275c477a853&sce=60-4-3&rf=0-0";
        CallableTest callableTest = new CallableTest(url,"1.jpg");

        ExecutorService ser = Executors.newFixedThreadPool(1);//线程池
        //创建执行服务

        Future<Boolean> r1 = ser.submit(callableTest);
        //提交执行

        boolean rs1 = r1.get();
        //获取结果

        ser.shutdownNow();
        //关闭服务

    }
}
