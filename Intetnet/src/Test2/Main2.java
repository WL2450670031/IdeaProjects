package Test2;
//server 实现一个简单的服务器

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * @author 吴乐
 */
public class Main2
{
    public static void main(String[] args) throws IOException
    {
        try(Socket socket = new Socket("8.130.55.13",22);
            Scanner in = new Scanner(socket.getInputStream(),"GBK"))
        {
            while(in.hasNextLine())
            {
                String line = in.nextLine();
                System.out.println(line);
            }

        }
    }
}
