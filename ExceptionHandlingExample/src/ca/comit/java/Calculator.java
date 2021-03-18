package ca.comit.java;

public class Calculator {
	
	public int divide(int a, int b) throws ArithmeticException
	{
		int res = 0, res2;
		
		try
		{
			 res = a/b;
			 res2 = 6/7;
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Division is not possible because the b is 0");
		}
		//return res;
		
		
		if ( b == 0 )
			throw new ArithmeticException();
		
		return a / b;
	}

}
