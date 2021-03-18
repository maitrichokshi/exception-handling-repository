package ca.comit.java;

public class TestCalc {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		
		int res = 0;
		try
		{
			res = myCalc.divide(6,  7);
		
			System.out.println(" Division Result " + res);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Exception orrcured during division operation");
		}
		finally
		{
			System.out.println("This block will always be executed");
		}
		
		//res = myCalc.divide(10,  11);
		
		//System.out.println(" Division Result " + res);
		
	
	}

}
