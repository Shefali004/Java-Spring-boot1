package Calculator_main;

import java.io.IOException;

public class Menu {

	public void showOutput() throws IOException
	{
		System.out.println("****Welcome to Calculator APP****");
		System.out.println("Operations:");
		System.out.println("1.Addition\n"+"2.Subtraction\n"+"3.Multiplication\n"+"4.Division\n"+"5.exit");
		System.out.println("Enter choice:");
		Calculator c=new Calculator();
		 int input = BasicInput.readInteger();
	do {
		System.out.println("Enter Your First number:");
		int a=BasicInput.readInteger();
		System.out.println("Enter Your Second number:");
		int b=BasicInput.readInteger();
		switch(input)
		{
		case 1:
			
			
			c.add(a, b);
		break;
		case 2:
			
			c.sub(a, b);
		break;
		
		case 3:
			
			c.mul(a, b);
		break;
		case 4:
			
			c.div(a, b);
		break;
		
		
		
		}
	}while(input!=5);
	
}

}