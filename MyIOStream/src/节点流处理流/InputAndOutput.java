package 节点流处理流;

import java.util.Scanner;

public class InputAndOutput
{
    public static void main(String[] args)
    {
        //System类的public final static InputStream in = null;
        //System.in 编译类型  InputStream
        //System.in 运行类型 BufferedInputStream

        System.out.println(System.in.getClass());

        //public final static PrintStream out = null;
        //System.out  编译类型  PrintStream
        //System.out  运行类型  PrintStream
        //标准输出
        System.out.println(System.out.getClass());

        Scanner in = new Scanner(System.in);
        //System.in 到键盘读取内容
    }
}

