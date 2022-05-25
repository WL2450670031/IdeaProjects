package DownloadTest;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Download
{ //下载器

    public void download(String url,String fileName)//下载方法
    {
        try
        {//把网络上的文件下载
            FileUtils.copyURLToFile(new URL(url),new File(fileName));
        }catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("download方法出现问题");
        }

    }
}
