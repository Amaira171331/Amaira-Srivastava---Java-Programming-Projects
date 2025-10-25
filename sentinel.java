import java.util.Scanner;
class sentinel
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int value=IO.readInt();
        final int SENTINEL = -999;
        while (value != SENTINEL)
        {
            System.out.println("Enter a value");
            //value=sc.nextInt();
            value=IO.readInt();
        }
        
    }
}