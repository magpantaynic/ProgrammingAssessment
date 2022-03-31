/*
	Paper wraps Rock to win
	Scissors cut Paper to win
	Rock breaks Scissors to win

	This program will be a Java Console Application called RockPaperScissors.

	The program first asks the user how many rounds he/she wants to play.
	Maximum number of rounds = 10, minimum number of rounds = 1.  If the user asks for something outside this range, the program prints an error message and quits.
	If the number of rounds is in range, the program plays that number of rounds.  Each round is played according to the requirements below.
	
	For each round of Rock, Paper, Scissors, the program does the following:
	The computer asks the user for his/her choice (Rock, Paper, or Scissors).
	Hint: 1 = Rock, 2 = Paper, 3 = Scissors
	

	After the computer asks for the user’s input, the computer randomly chooses Rock, Paper, or Scissors and displays the result of the round (tie, user win, or computer win).
	Hint: use the Random class.
	


	The program must keep track of how many rounds are ties, user wins, or computer wins.
	Hint: Create three variables to keep track of these items and update them correctly after each round.
	



	The program must print out the number of ties, user wins, and computer wins and declare the overall winner based on who won more rounds.
	



	After all rounds have been played and the winner declared, the program must ask the user if he/she wants to play again.
	If the user says No, the program prints out a message saying, “Thanks for playing!” and then exits.
	If the user says Yes, the program starts over, asking the user how many rounds he/she would like to play.
		



*/

import java.util.Scanner;
import java.util.Scanner;



public class RockPaperScissors {

	public static void main(String[] args)
	{

		int Rock = 1;
		int Paper = 2;
		int Scissors = 3;
		int compChoice;
		int userChoice = 0;

		Scanner input = new Scanner(System.in);
		Random randomizer = new Random();



		System.out.println("How many rounds do you want to play?");
		// Minimum of 1 round, max of 10 rounds
		userChoice = input.nextLine();

		//	if (input > 10 || input < 1)
		/*	{

				System.out.println("Error, number of rounds chosen is out of range");
				return; <-- program should quit at this point
			}
			else if (input == 1 || input >= 10 )
			{
					

			}

		*/


		/* Pseudocode for the process of the game

		if(user )


		*/


		// Print lines to include in the code for later
		
		// Rock breaks Scissors to win
		System.out.println("User chose rock, computer chose Scissors. User wins");
		System.out.println("Computer chose rock, user chose Scissors. Computer wins");
		System.out.println("Both User & Computer chose Rock. Tie");


		// Paper wraps Rock to win
		System.out.println("User chose Paper, computer chose rock. User wins");
		System.out.println("Computer chose Paper, user chose Rock. Computer wins");
		System.out.println("Both User & Computer chose Paper. Tie");


		// Scissors cut Paper to win
		System.out.println("User chose Scissors, computer chose Paper. User wins");
		System.out.println("Computer chose Scissors, user chose Paper. Computer wins");
		System.out.println("Both User & Computer chose Scissors. Tie");



	}


}
