package HomeWorkTest_5_7;

public class SingleQuestion {
	private char answer;//回答
	
	public SingleQuestion() {}

	public SingleQuestion(String test,String[] options,char answer)
	{//题目，选项。答案
		this.answer=answer;
		System.out.println(test);
		for(int i=0;i<4;i++)
			System.out.print(options[i]+"\t");
	}
	
	public boolean check(char[] answers)//回答
	{
		boolean haha= answers[0]== answer;

		if(answers.length != 1)//如果答案个数等于0或大于1个，就为错误。
			haha=false;
		return haha;
	}

}
