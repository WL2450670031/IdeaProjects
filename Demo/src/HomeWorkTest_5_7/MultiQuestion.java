package HomeWorkTest_5_7;

public class MultiQuestion {
	private char[] answer=new char[4];
	
	public MultiQuestion() {
		super();
	}
	
	public MultiQuestion(String test,String[] options,char[] answer)
	{
		this.answer=answer;
		System.out.println(test);
		for(int i=0;i<4;i++)
			System.out.print(options[i]+"\t");
	}

	public boolean check(char[] answers)//�ش�
	{
		boolean haha= (answers[0] == answer[0]&&answers[1] == answer[1]&&answers[2] == answer[2]);
		if(answers.length!=3)//����𰸸�������0������ڴ�������Ϊ����
			haha=false;
		return haha;
	}
}
