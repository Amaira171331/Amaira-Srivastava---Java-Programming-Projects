import java.util.Scanner;
public class SquareDisplay {
	/** This program creates a square made out of "X"s based off the number the user enters*/ 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length;
		System.out.println("Enter a positive integer no greater than 15"); //asks user for length of each side on square
		length=sc.nextInt(); //holds value in "length"
		for (int i=1;i<=length;i++)
		{
			System.out.println(""); //creates a new line after every row
			for (int j=1;j<=length;j++) 
			{
				System.out.print("X"); //adds "X"s to the columns
			}
		}
		
	}
}
