package ca.comit.java;

public class ArrayExample {
	// Write a java class that iterates over an int array of size 5 and prints the values of the array.
	// Try to print the array element at index 20.
	// Name the exception that gets generated during the above processing.
	// Update your code to handle the exception.
	public static void main(String args[])
	{
		
	
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 1;
		intArray[3] = 2;
		intArray[4] = 1;
		//intArray[5] = 2;
		
		int[] intArray2 = {11,12,13,14,15};
		
		for (int i=0; i < 5; i++)
		{
			System.out.println("Value of intArray[" + i + "] = " + intArray[i]);
		}
	
		try
		{
		System.out.println("Value of intArray[20] = " + intArray[20]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception has occured");
		}
	}

}
