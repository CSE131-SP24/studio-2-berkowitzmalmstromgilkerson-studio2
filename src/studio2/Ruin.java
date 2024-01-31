package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money are you starting with?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is the probability that you win a single play? (between 0-1)");
		double winChance = in.nextDouble();
		
		System.out.println("How much money won would you consider a successful day?");
		double winLimit = in.nextDouble();
		
		
		System.out.println("How much money does each game cost?");
		double input = in.nextDouble();
		
		System.out.println("How many days do you want to simulate?");
		int totalSimulations = in.nextInt();
		

		int day = 1;
		int plays = 0;
		double balance;
		double net;
		double winnings = 0;
	while(day <= totalSimulations)	 {
		balance = startAmount;
		while (balance < winLimit && balance > 0) {
			double rand = Math.random();
			
			if (rand < winChance) {
				balance = balance + input;

			} else { 
				balance = balance - input;
			}

	
		plays = plays + 1;	
	
		
		}
		System.out.println("There were " + plays + " plays today");
		
			if (balance >= winLimit) {
				System.out.println("Today was a success");
			
			} else { 
				System.out.println("Today was a ruin, try again tomorrow!");
				
			}
		
		System.out.println("It is day: " + day);
		day = day + 1;
		plays = 0;
		net = balance - startAmount;
		winnings = winnings + net;
	}
	
		System.out.println(winnings);
	
		

		
		
		
		
		
	}

}
