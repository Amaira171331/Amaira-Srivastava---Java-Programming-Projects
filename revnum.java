import java.util.Scanner;
class revnum
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int n=sc.nextInt();
        int rem, revNum=0;
        for (int i=0; i<=n; i++)
        {
            rem = n % 10;
            revNum = revNum * 10 + rem;
            n /= 10;
        }
        System.out.println(revNum);
    }
}