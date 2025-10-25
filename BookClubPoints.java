import java.util.Scanner;
public class BookClubPoints {
	/** This program finds the total points given to members in a book club based off the amount of books they purchase per month */ 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total_points = 0;
		System.out.println("How many books have you purchased this month?"); //asks user amount of books they bought
		int books=sc.nextInt(); //holds value in "books"
		if (books==0)
		{
			total_points=0;
			
		}
		else if (books==1)
		{
			total_points=5;
		}
		else if (books==2)
		{
			total_points=15;
		}
		else if (books==3)
		{
			total_points=30;
		}
		else if (books>=4)
		{
			total_points=60;
		}
		System.out.println("Your total points recived this month are "+total_points+" points"); //prints total points
		
	}
	

}
