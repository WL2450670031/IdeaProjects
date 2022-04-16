package ArrayCompleteBinaryTree;

import java.util.Scanner;

//用数组实现的完全二叉树
/*
data
index  1 2 3 4
number 1 2 3 4
                            1
                        2       3
                      4   5   6   7
              left_number = index*2,
              right_number = index*2+1,
              index = number/2;

 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("输入结点个数：");
        int size = in.nextInt();

        int[] completeBinaryTree = new int[size];
        System.out.println("从左到右，从上到下依次输入结点:");

        for(int i = 0;i < size; i++)
        {
            completeBinaryTree[i] = in.nextInt();
        }
        in.close();

        System.out.println("数组结构表示：");
        for(int i:completeBinaryTree)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("树结构表示：");
        int a = 0;
        int b = 0;
        for(int i = 0;i < size;i++)
        {
            b++;
            System.out.print(completeBinaryTree[i]);
            if(b % Math.pow(2,a) == 0)
            {
                System.out.println();
                b = 0;
                a++;
            }
        }
    }
}
