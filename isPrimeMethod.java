import java.util.Scanner;
public class isPrimeMethod {
/** This program checks to see if a given number is prime or not*/ 
public static boolean prime_number(int num)
{
	int divisible=0;
	for (int i=1;i<=num;i++)
	{
		if (num%i==0)
		{
			divisible=divisible+1;
		}
	}
	if (divisible>2)
	{
		return false;
	}
	else
	{
		return true;
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter a number to see if is prime or not: "); //asks user for length of each side on square
	num=sc.nextInt(); //holds value in "num"
	if (prime_number(num)==true)
	{
		System.out.println("This number is a prime number");
	}
	else
	{
		System.out.println("This number is not a prime number");
	}

}
}
