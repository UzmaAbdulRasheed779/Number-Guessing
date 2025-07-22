package Guessing;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		char playagain;
		do{
		System.out.println("Welcome to number guessing game");
		System.out.println("Chose difficulty level");
		System.out.println("1 - Easy(1 to 50)");
		System.out.println("2 - Medium(1 to 100)");
		System.out.println("3 - Hard(1 to 500)");
		
		int difficulty = s.nextInt();
		
		int max = 100;
		if(difficulty == 1) {
			max = 50;
		}else if(difficulty == 3){
			max = 500;
		}
		
		/////////Random number between 1 and maxRange
		int guess = r.nextInt(max) + 1;
	//1	System.out.println("[Debug] Hidden number is: " + guess);

		int num;
		int attempts = 0;
		
		System.out.println("i am thinking a number between 1 and   " + max);
		System.out.println("Try to guess it");
		
		do {
			System.out.println("Enter your guess number");
			num = s.nextInt();
			attempts++;
			
			if(num>guess) {
				System.out.println("Too High Try again");
			}else if (num<guess) {
				System.out.println("Too Low  Try again");
			}
		else {
			System.out.println("Congratulation you guessed it right " + attempts + "attempts");
		}
	}while(num != guess);
		System.out.println("Do you want to play again (Y/N)");
		
		playagain = s.next().charAt(0);

		
	}while(playagain == 'Y' || playagain == 'y');
		System.out.println("Thanks for playing");
		 s.close();		
		
		
		
		



	}

}


