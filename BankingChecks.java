import java.util.Scanner;
public class BankingChecks {
	/** This program finds the total fee one must pay to the bank based off of the amount of checks they wrote that month with a base fee of 10 dollars */ 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double total_amount;
		System.out.println("How many checks have you written this month?"); //asks user amount of checks they wrote
		int checks=sc.nextInt(); //holds value in "checks"
		if (checks<20)
		{
			total_amount=(0.10*checks)+10;
			
		}
		else if ((checks>=20) && (checks<=39))
		{
			total_amount=(0.08*checks)+10;
		}
		else if ((checks>=40) && (checks<=59))
		{
			total_amount=(0.06*checks)+10;
		}
		else 
		{
			total_amount=(0.04*checks)+10;
		}
		System.out.println("Your total fees of the month are $"+total_amount+" dollars"); //prints total fee
		
	}
	

}
