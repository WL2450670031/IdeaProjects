package HomeWorkTest_5_7;

public class Question {
	private String test;
	private String options;
	public Question()
	{
		super();
	}
	public Question(String test,String options)
	{
		this.test=test;
		this.options=options;
	}
	
	public boolean check(char[] answers)
	{
		return true;
	}
	
	public void print()
	{
		System.out.println(test);
		System.out.println(options);
	}
}
