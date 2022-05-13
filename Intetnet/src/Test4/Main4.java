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
            final Download downUtil=new Download("https://download.jetbrains.com.cn/"
                    + "idea/ideaIC-2022.1.1.exe?_gl=1*ttf7rf*_ga*MTg1MjQ0NzE5OC4xNjQwNTkzNjI0*_ga_9J976DJZ68*MTY1MjQ1MTE4My4yLjEuMTY1MjQ1MTMwNi41OQ.."
                    , "ideaIC-2022.1.1.exe", 4);
            // 开始下载
            downUtil.download();

            new Thread()
            {
                @Override
                public void run()
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
                }
            }.start();
            long b = System.currentTimeMillis();
            System.out.println((b-a)/1000+"s");
        }
}



