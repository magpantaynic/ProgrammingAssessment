/* 
	Make a simple calculator that asks the user for their age. Then calculate the healthy heart rate range for that age, and display it.

	Their maximum heart rate should be 220 - their age.
	The target heart rate zone is the 50 - 85% of the maximum.

	--------------------------------------------------------------------

	Output:

	What is your age? 50
	Your maximum heart rate should be 170 beats per minute
	Your target HR Zone is 85 - 145 beats per minute


*/

import java.util.Scanner;
import java.util.Random;



public class HealthyHearts{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		Random randomizer = new Random();

		
		int maxHR = 220 - age;
		int targetHR1 = maxHR * 0.5;
		int targetHR2 =  maxHR * 0.85;


		System.out.println("How old are you?: ");
		int age = input.nextInt();


		System.out.println("Your max heart rate should be " + maxHR + " beats per minute");
		System.out.println("Your target HR Zone is " + targetHR1 + " - " targetHR2 + " beats per minute." );

	}

}
