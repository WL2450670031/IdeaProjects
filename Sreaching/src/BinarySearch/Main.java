package BinarySearch;

import java.util.Scanner;
/*
吴乐 汉江师范学院 数计学院 2022.4.19
*/
public class Main
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);

                int size = 10;
                int[] a = new int[size];
                int b;

                System.out.println("输入数据(从小到大)：");
                for(int i = 0 ;i < size;i++)
                {
                        a[i] = in.nextInt();
                }
                System.out.print("输入要找的数据：");
                b = in.nextInt();
                System.out.print(binarySearch(a,b));
        }

        public static boolean binarySearch(int[] a,int b)
        {
                int left = 0;
                int right = a.length-1;
                int mid = (left + right)/2;

                do {
                        if (a[mid] > b)
                        {
                                right = mid - 1;
                                mid = (left + right) / 2;
                        }
                        else if (a[mid] < b)
                        {
                                left = mid + 1;
                                mid = (left + right) / 2;
                        }
                        else
                        {
                                return true;
                        }
                } while (left <= right);

                return false;
        }


}
