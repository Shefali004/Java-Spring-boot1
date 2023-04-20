package Calculator_main;

public class Calculator {

	static float c;
	public  void add(int a ,int b)
	{
		c=a+b;
		System.out.println("Addition Value:"+c);
	}
	public  void sub(int a ,int b)
	{
		c=a-b;
		System.out.println("Subtraction Value:"+c);
	}
	public  void mul(int a ,int b)
	{
		c=a*b;
		System.out.println("Multiplication Value:"+c);
	}
	public  void div(int a ,int b)
	{
		c=a/b;
		System.out.println("Division Value:"+c);
	}
	
}
