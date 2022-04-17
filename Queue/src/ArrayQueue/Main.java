package ArrayQueue;
//循环队列，front指向的数组不存储数据

import java.util.Objects;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Queue queue = new Queue();

        String cmd;

        System.out.println("<循环队列>");
        System.out.println("<命令：add,get,printAll,exit>");
        while(true)
        {
            System.out.print("->");
             cmd = in.next();
            if(Objects.equals(cmd, "add"))
            {
                if(!queue.addData(new Data(in.nextInt())))
                    System.out.println("full");
            }
            else if(Objects.equals(cmd, "get"))
            {
                System.out.println(queue.getData());
            }
            else if(Objects.equals(cmd, "printAll"))
            {
                queue.printAll();
            }
            else if(Objects.equals(cmd, "exit"))
            {
                System.out.println("bye~");
                break;
            }
            else
            {
                System.out.println("命令错误");
            }
        }
    }
}
