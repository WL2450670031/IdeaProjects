package LinkedQueue;

import java.util.Objects;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        LinkQueue linkQueue = new LinkQueue();

        String cmd;

        System.out.println("<链表队列>");
        System.out.println("<命令：add,get,printAll,exit>");

        while(true)
        {
            System.out.print("->");
            cmd = in.next();
            if(Objects.equals(cmd, "add"))
            {
                linkQueue.addData(new Node(in.nextInt()));
            }
            else if(Objects.equals(cmd, "get"))
            {
                System.out.println(linkQueue.getData());
            }
            else if(Objects.equals(cmd, "printAll"))
            {
                linkQueue.printAll();
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
