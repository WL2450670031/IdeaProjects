package Callable;

import DownloadTest.Download;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.Callable;

public class CallableTest implements Callable
{
    private String url;
    private String fileName;

    public CallableTest(String url,String fileName)
    {
        this.fileName = fileName;
        this.url = url;
    }

    @Override
    public Object call() throws Exception
    {
            Download download = new Download();
            download.download(url,fileName);
            System.out.println(fileName+"下载完成");
            return true;
    }
}
