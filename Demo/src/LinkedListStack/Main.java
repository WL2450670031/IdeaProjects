package LinkedListStack;

import java.util.Objects;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Stack stack = new Stack();
        String cmd;
        caidan();
        while(true)
        {
            System.out.print("->");
            cmd = in.next();
            if(Objects.equals(cmd, "push"))
            {
                stack.push(new Node(in.next(),in.nextInt(),in.next()));
            }
            else if(Objects.equals(cmd, "pop"))
            {
                System.out.println(stack.pop());
            }
            else if(Objects.equals(cmd, "printAll"))
            {
                stack.printAllNode();
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

    public static void caidan()
    {
        System.out.println("<堆栈>");
        System.out.println("命令：push,pop,printAll,exit");
    }
}
