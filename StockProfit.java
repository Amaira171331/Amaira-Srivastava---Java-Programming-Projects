import java.util.Scanner;
public class StockProfit {
	/* This program returns profit/loss based off the data user enters*/ 
	public static int profit(int NS,int PP,int PC, int SP, int SC)
	{
		int profit = ((NS * SP) - SC) - ((NS * PP) + PC);
		return profit;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of shares: ");
		int NS = sc.nextInt();
		System.out.println("Enter the purchase price per share: ");
		int PP = sc.nextInt();
		System.out.println("Enter the purchase commission paid: ");
		int PC = sc.nextInt();
		System.out.println("Enter the sale price per share: ");
		int SP = sc.nextInt();
		System.out.println("Enter the sale commision price:  ");
		int SC = sc.nextInt();
		int ans=profit(NS,PP,PC,SP,SC);
		if (ans>0)
		{
			System.out.println("The total profit made is: $"+ans);
		}
		else if (ans<0)
		{
			System.out.println("The total loss is: $"+ans);
		}
		else
		{
			System.out.println("You broke even");
		}
		
		
	}
}