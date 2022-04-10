package HomeWorkTest_5_7;

import java.util.Scanner;

/*
*吴乐，软件工程2001班，202010502041
 */
public class Test {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int num;
		SingleQuestion singleQuestion;
		MultiQuestion multiQuestion;
		System.out.println("1.单选题\n2.多选题");
		num=scn.nextInt();
		switch(num)
		{
		case 1:
			{
				singleQuestion=new SingleQuestion("最早向刘备举荐诸葛亮的是谁？",
						new String[] {"A，徐庶","B，司马徽","C，鲁肃","D，关羽"},'C');
				System.out.println("请输入答案:");
				String abcd=scn.next();
				if(singleQuestion.check((abcd.toUpperCase()).toCharArray()))
				{
					System.out.println("回答正确");
				}
				else
				{
					System.out.println("回答错误");
				}
				break;
			}
		case 2:
			{
				multiQuestion=new MultiQuestion("三国三绝谁？",
						new String[]{"A,曹操","B，刘备","C，关羽","D,诸葛亮"},new char[] {'A','C','D'});
				System.out.println("请输入答案:");
				String abcd=scn.next();
				if(multiQuestion.check((abcd.toUpperCase()).toCharArray()))
				{
					System.out.println("回答正确");
				}
				else
				{
					System.out.println("回答错误");
				}
				break;
			}
		default:System.out.println("输入错误");
		}
	}
}
