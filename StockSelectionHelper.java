/**
* Name: David Morgan
* File: StockSelectionHelper
* Description: Help user determine how much stock they can buy
*/


import java.util.Scanner;


public class StockSelectionHelper {
	public static void main(String[] args) {
		//Declare input from scanner
	 Scanner input = new Scanner(System.in);
	 	//Display prompt and gain invested money input from user
		System.out.print("Enter total ammount of money you are willing to invest:");
		double investedMoney = input.nextDouble();
		
		//Display prompt and gain Stock Ticker from user
		System.out.println("Enter the stock ticker:");
		String stockTicker = input.next();
		int counter = stockTicker.length();
		
		//IF statement to determine if valid tick is entered
		//If false lets user enter again
		if (counter > 5)
		{
			System.out.println("Please enter valid tick:");
			stockTicker = input.next();
		}
		
		//Display prompt and gain P/E ratio from user
		System.out.println("Enter product ratio:");
		double ratio = input.nextDouble();
		
		
		//Display prompt and gain stock price from user
		System.out.println("Please enter price of stock");
		double stockPrice = input.nextDouble();
		//If statement to determine if stock price is above 1 dollar
		//If false lets user enter again
		if (stockPrice < 1.00)
		{
			System.out.println("Please enter valid price:");
			stockPrice = input.nextDouble();
		}
		//Determines amount of stock user can buy and stores amount in variable
		double stockAvailable = investedMoney / stockPrice;
		
		//Prints out all data
		System.out.println("Stock: " + stockTicker);
		System.out.println("Price: $" + stockPrice);
		System.out.println("P/E Ratio: " + ratio);
		//If ratio is above 45 tells user that stock is over valued
		if (ratio > 45)
		{
			System.out.println("Over Valued Stock!");
		}
		System.out.println("# of shares able to purchase:" + stockAvailable);
	
		
	 
	   
	    
	}
}
