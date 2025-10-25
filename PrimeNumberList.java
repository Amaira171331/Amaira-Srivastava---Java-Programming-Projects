import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class PrimeNumberList {
	/** This program stores a list of all prime numbers from 1-100 in a file*/ 
	public static void main(String[] args) throws IOException {
		PrintWriter writer = new PrintWriter("src/primeNumbers.txt");
		int divisible=0;
		for (int i=1;i<=100;i++)
		{
			divisible=0;
			for (int j=1;j<=i;j++)
			{
				if (i%j==0)
				{
					divisible=divisible+1;
				}
			}
			if (divisible==2)
			{
				writer.println(i); // write prime to file
			}
		}
		writer.close();
		System.out.println("Data written to file");
		System.out.println(new File("primeNumbers.txt").getAbsolutePath());
	}
}