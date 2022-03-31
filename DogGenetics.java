/* 

	Write a program that asks the user for the name of their dog, and then generates a fake DNA background report on the pet dog.
	It should assign a random percentage to 5 dog breeds (that should add up to 100%!) 


	Output:
		What is your dog's name? Sir Fluffy McFlufferkins Esquire
		Well then, I have this highly reliable report on Sir Fluffy McFlufferkins Esquire's prestigious background right here.

		Sir Fluffy McFlufferkins Esquire is:

		61% St. Bernard
		2% Chihuahua
		29% Dramatic RedNosed Asian Pug
		1% Common Cur
		7% King Doberman

		Wow, that's QUITE the dog!  

*/

import java.util.Scanner;
import java.util.Random;



public class DogGenetics {

	public static void main(String[] args)
	{

			Scanner input = new Scanner(System.in);
			Random randomizer = new Random();
			String dogName = "";
			String [] dogBreeds = {"St. Bernard", "Chiuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
			int percent = 100;


			System.out.println("What is your dog's name?");
			dogName = input.nextLine();

			System.out.println("Well then, I have this highly reliable report on " + dogName + " 's prestigious background right here!");
			System.out.println(dogName + " 'is: ");

			// do the math for the DNA percentage here
			for(int i=0; i < dogBreeds.length - 1; i++)
			{
				int percentDNA = randomizer.nextInt(percent) + 1;
				percent -= percentDNA;
				System.out.println(percent + "%" + dogBreeds[i]);
				percent = percent - percentDNA;

			}

			System.out.println(percent + "%" + dogBreeds[4]);
			System.out.println("Wow, that's QUITE the dog!");


	}


}
