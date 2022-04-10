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

	public boolean check(char[] answers)//回答
	{
		boolean haha= (answers[0] == answer[0]&&answers[1] == answer[1]&&answers[2] == answer[2]);
		if(answers.length!=3)//如果答案个数等于0个或大于答案数，就为错误。
			haha=false;
		return haha;
	}
}
