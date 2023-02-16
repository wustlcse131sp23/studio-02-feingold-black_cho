package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What's your starting amount?");
		double startAmount = in.nextDouble();
		System.out.println("What's your win chance? (as a decimal)?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
		System.out.println("How many days at the casino?");
		int totalSimulations = in.nextInt();
		double a = (1-winChance)/winChance;
		double expectedRuin;
		if (winChance == 0.5)
		{
		expectedRuin = 1 - startAmount/winLimit;
		}
		else
		{
			expectedRuin = ((Math.pow(a,startAmount)-Math.pow(a,winLimit))/(1-Math.pow(a,winLimit)));
		}
		double lossCount = 0;
		double winCount = 0;
		// for (startAmount
		for (int i=1; i <= totalSimulations; i++)
		{
			double amount = startAmount;
			int playCounter = 0;
			
			while (amount > 0 && amount < winLimit)
			{
				 if (Math.random() <= winChance) 
				 {
					 amount += 1;
				 }
				 else
				 {
					 amount -= 1;
				 }
				 playCounter++;
				 if (amount==0)
				 {
					 lossCount++;
				 }
				}
			System.out.println("Day number: " + i);
			System.out.println("Number of plays: " + playCounter);
			System.out.println("Was the day a success? " + (amount == winLimit));
		}
		System.out.println("Ruin rate: " + lossCount/totalSimulations + ". " + "Expected ruin rate: " + expectedRuin);
	}

}
