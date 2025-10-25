/** The class Maximum_Array finds the maximum value in the array numbers_array */
public class Maximum_Array {
	public static void main(String[] args)
	{
		// declaration and construction
		int[] numbers_array = new int[5];
		
		// initialization
		numbers_array[0] = 4;
		numbers_array[1] = 10;
		numbers_array[2] = 6;
		numbers_array[3] = 2;
		numbers_array[4] = 1;
		
		//comparison to find the maximum
		int length = numbers_array.length;
		int max = 0;
		for (int i=0 ; i<length ; i++)
		{
			if (numbers_array[i] > max)
			{
				max = numbers_array[i];
			}
		}
		
		// print maximum value
		System.out.println("The maximum value of the array is:  " + max);
	}
}
