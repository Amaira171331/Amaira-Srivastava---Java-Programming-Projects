/**
 * This class encapsulates Book objects
 */
public class BookTester { 
	private int pages;
	private String name;
	private double price;
	
	/**
	 * Default constructor
	 */
	BookTester()
	{
		this.pages = 0;
        this.name = "Not given";
        this.price = 0.0;
	}
	
	/**
	 * Overloaded constructor
	 */
	BookTester(int pages, String name, double price) {
        this.pages = pages;
        this.name = name;
        this.price = price;
	}
	
	/**
	 * toString method
	 */
	public String toString() {
        return "Book Name: " + name + ", Pages: " + pages + ", Price: $" + price;
	}
	
	/**
	 * Main function
	 */
	public static void main(String[] args)
	{
		BookTester book_one = new BookTester();
		BookTester book_two = new BookTester();
		BookTester book_three = new BookTester(378, "Intro to Java", 25.99);
		BookTester book_four = new BookTester(500, "Intro to Python", 22.99);
		System.out.println(book_one.toString());
        System.out.println(book_two.toString());
        System.out.println(book_three.toString());
        System.out.println(book_four.toString());	
	}
	
}