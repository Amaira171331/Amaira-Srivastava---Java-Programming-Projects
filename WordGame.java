import java.util.Scanner;
public class WordGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter the name of a city");
		String city=sc.next();
		System.out.println("Enter the name of a college");
		String college=sc.next();
		System.out.println("Enter a profession");
		String profession=sc.next();
		System.out.println("Enter a type of animal");
		String animal=sc.next();
		System.out.println("Enter a pet name");
		String AnimalName=sc.next();
		System.out.println("There once was a person named " + name +  " who lived in " +city+". At the age of "+age+", "+name+" went to college at "+ college + ". "+name+" graduated and went to work as a "+profession+". Then, "+name+" adopted a(n) "+animal+" named "+AnimalName+".They both lived happily ever after!");
		
	}
	

}
