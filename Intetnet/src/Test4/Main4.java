package Test4;

/**
 * @author 吴乐
 */
public class Main4
{
        public static void main(String[] args) throws Exception
        {
            long a = System.currentTimeMillis();
            // 初始化DownUtil对象
            //
            final Download downUtil=new Download("https://dlcdn.apache.org/"
                    + "tomcat/tomcat-9/v9.0.63/bin"
                    , "apache-tomcat-9.0.63.zip", 4);
            // 开始下载
            downUtil.download();

            new Thread(() ->
            {
                while(downUtil.getCompleteRate() < 1)
                {
                    // 每隔0.1秒查询一次任务的完成进度
                    // GUI程序中可根据该进度来绘制进度条
                    System.out.println("已完成："+ downUtil.getCompleteRate());
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (Exception ex){}
                }
            }).start();
            long b = System.currentTimeMillis();
            System.out.println((b-a)/1000+"s");
        }
}



