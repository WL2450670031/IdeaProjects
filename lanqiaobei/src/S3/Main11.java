package S3;
/*
吴乐 汉江师范学院 2022.3.6
 */
import java.util.Scanner;

/*
小蓝正在学习一门神奇的语言，这门语言中的单词都是由小写英文字母组 成，有些单词很长，
远远超过正常英文单词的长度。小蓝学了很长时间也记不住一些单词，他准备不再完全记忆这些单词，
而是根据单词中哪个字母出现得最多来分辨单词。现在，请你帮助小蓝，给了一个单词后
，帮助他找到出现最多的字母和这个字母出现的次数。

输入描述
输入一行包含一个单词，单词只由小写英文字母组成。
对于所有的评测用例，输入的单词长度不超过 1000。
 */
public class Main11 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        charNumber(s);
    }

    public static void charNumber(String s)
    {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int[] num = new int[26];
        for(int i = 0;i<26;i++)
            num[i] = 0;
        for(int i = 0;i<s.length();i++)
        {
            int j = a.indexOf(s.charAt(i));
            if(j != -1)
                num[j]++;//逐个比较被测字符串的字母，然后将对应的字符数加1。
        }
        int maxIndex = getMax(num);
        System.out.println(a.charAt(maxIndex));
        System.out.println(num[maxIndex]);

    }

    public static int getMax(int[] num)//将数字中最大的数下标返回
    {
        int max = 0;
        for(int i=1;i<26;i++)
        {
            if(num[i] > num[max])
                max = i;
        }
        return max;//返回最大的数的下标。
    }

}
