/* 
	Write a static method that takes in an array of ints, adds them together, and returns the result.
	Call your new method inside a main method and print out the result for the following three example arrays:

	{ 1, 90, -33, -55, 67, -16, 28, -55, 15 }
	{ 999, -60, -77, 14, 160, 301 }
	{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
	140, 150, 160, 170, 180, 190, 200, -99 } 

--------------------------------------------------------------------

	Output:

	#1 Array Sum: 42
	#2 Array Sum: 1337
	#3 Array Sum: 2001 


*/

public class SummativeSums {

	public static void main(String[] args)
	{
		
	int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
	int[] array2 = { 999, -60, -77, 14, 160, 301 };
	int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
						140, 150, 160, 170, 180, 190, 200, -99 };


	System.out.println("#1 Array Sum: " + sum(array1));
	System.out.println("#2 Array Sum: " + sum(array2));
	System.out.println("#3 Array Sum: " + sum(array3));


	}

	public static int sum(int[] array)
	{
		int sumArray = 0;
		for(int i=0; i < array.length; i++)
		{
			// this line will check each position and adding as it goes on
			sumArray += array[i];
		}
		return sumArray;

	}

}
