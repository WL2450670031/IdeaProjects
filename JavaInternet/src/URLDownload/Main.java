package URLDownload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main
{
    public static void main(String[] args) throws IOException {
        //1.下载地址
        String path = "http://127.0.0.1:8080/wule/hello.txt";
        URL url = new URL(path);
        //2.连接到该资源
        HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        //获取url流
        FileOutputStream fileOutputStream = new FileOutputStream("D://hello.txt");

        byte[] buf = new byte[1024];
        int len;
        while( (len = inputStream.read(buf)) != -1)
        {
            fileOutputStream.write(buf,0,len);//保存数据
        }
        fileOutputStream.close();
        inputStream.close();
        httpURLConnection.disconnect();//断开与url连接
    }

}
