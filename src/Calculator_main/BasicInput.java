package Calculator_main;

import java.io.IOException;

public class BasicInput {

	public  static  String  readString() throws IOException
	{
		byte b[] = new byte[255];
		int length = System.in.read(b);
		byte bt[] = new byte[length];
		System.arraycopy(b,0,bt,0,length);
		
		String s = new String(bt);
		return s;
	}
	
	public static  int readInteger() throws IOException
	{
		//String s = readString();
		//System.out.println(s);
		int i = Integer.parseUnsignedInt(readString());
		return i ;
	}
	public  static float readFloat() throws IOException
	{
		float a = 0;
		String s=readString();
		a=Float.parseFloat(s);
	   return a;
	}
	public static   double readDouble() throws IOException
	{
		double a = 0;
		String s=readString();
		a=Double.parseDouble(s);
	   return a;
	}
	
}
