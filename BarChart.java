import java.util.Scanner;
public class BarChart {
	/** This program creates a bar chart based off the amount of sales different stores do */ 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter today's sales for Store 1: "); //asks user sales for store 1
		int Store1 = sc.nextInt();
		System.out.println("Enter today's sales for Store 2: "); //asks user sales for store 2
		int Store2 = sc.nextInt();
		System.out.println("Enter today's sales for Store 3: "); //asks user sales for store 3
		int Store3 = sc.nextInt();
		System.out.println("Enter today's sales for Store 4: "); //asks user sales for store 4
		int Store4 = sc.nextInt();
		System.out.println("Enter today's sales for Store 5: "); //asks user sales for store 5
		int Store5 = sc.nextInt();
		System.out.println("SALES BAR CHART");
		System.out.print("Store 1: ");
		double stars=Store1/100;
		while (stars>0) //prints total stars for store 1
		{
			System.out.print("*");
			stars=stars-1;
		}
		System.out.println("");
		System.out.print("Store 2: ");
		stars=Store2/100;
		while (stars>0) //prints total stars for store 2
		{
			System.out.print("*");
			stars=stars-1;
		}
		System.out.println("");
		System.out.print("Store 3: ");
		stars=Store3/100;
		while (stars>0) //prints total stars for store 3
		{
			System.out.print("*");
			stars=stars-1;
		}
		System.out.println("");
		System.out.print("Store 4: ");
		stars=Store4/100;
		while (stars>0) //prints total stars for store 4
		{
			System.out.print("*");
			stars=stars-1;
		}
		System.out.println("");
		System.out.print("Store 5: ");
		stars=Store5/100;
		while (stars>0) //prints total stars for store 5
		{
			System.out.print("*");
			stars=stars-1;
		}
		
	}
	

}
