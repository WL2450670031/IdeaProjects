package HomeWorkTest_5_7;

public class SingleQuestion {
	private char answer;//�ش�
	
	public SingleQuestion() {}

	public SingleQuestion(String test,String[] options,char answer)
	{//��Ŀ��ѡ���
		this.answer=answer;
		System.out.println(test);
		for(int i=0;i<4;i++)
			System.out.print(options[i]+"\t");
	}
	
	public boolean check(char[] answers)//�ش�
	{
		boolean haha= answers[0]== answer;

		if(answers.length != 1)//����𰸸�������0�����1������Ϊ����
			haha=false;
		return haha;
	}

}
