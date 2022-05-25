package DownloadTest;

public class ThreadTest extends Thread
{
    private String url;
    private String fileName;

    public ThreadTest(String url,String fileName)
    {
        this.fileName = fileName;
        this.url = url;
    }

    public void run()
    {
        Download download = new Download();
        download.download(url,fileName);
        System.out.println(fileName+"下载完成");
    }
}
