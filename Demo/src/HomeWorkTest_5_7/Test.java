package HomeWorkTest_5_7;

import java.util.Scanner;

/*
*���֣��������2001�࣬202010502041
 */
public class Test {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int num;
		SingleQuestion singleQuestion;
		MultiQuestion multiQuestion;
		System.out.println("1.��ѡ��\n2.��ѡ��");
		num=scn.nextInt();
		switch(num)
		{
		case 1:
			{
				singleQuestion=new SingleQuestion("�����������ټ����������˭��",
						new String[] {"A������","B��˾���","C��³��","D������"},'C');
				System.out.println("�������:");
				String abcd=scn.next();
				if(singleQuestion.check((abcd.toUpperCase()).toCharArray()))
				{
					System.out.println("�ش���ȷ");
				}
				else
				{
					System.out.println("�ش����");
				}
				break;
			}
		case 2:
			{
				multiQuestion=new MultiQuestion("��������˭��",
						new String[]{"A,�ܲ�","B������","C������","D,�����"},new char[] {'A','C','D'});
				System.out.println("�������:");
				String abcd=scn.next();
				if(multiQuestion.check((abcd.toUpperCase()).toCharArray()))
				{
					System.out.println("�ش���ȷ");
				}
				else
				{
					System.out.println("�ش����");
				}
				break;
			}
		default:System.out.println("�������");
		}
	}
}
