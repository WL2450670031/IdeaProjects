package S3;
/*
吴乐 汉江师范学院
begin    2022.2.25 17:46
happyend 2022.2.25
 */
/*
小蓝准备用 256MB 的内存空间开一个数组，
数组的每个元素都是 32位 二进制整数，
如果不考虑程序占用的空间和维护内存需要的辅助空间，
请问 256MB 的空间可以存储多少个 32 位二进制整数？
 */
public class Main3
{
    public static void main(String[] args)
    {
        System.out.println((256*1024*1024)/4);
    }
}
