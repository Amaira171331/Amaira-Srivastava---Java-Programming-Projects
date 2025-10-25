/**
 * This class encapsulates Book objects
 */
public class Book { 
	private int pages;
	private String name;
	private double price;
	
	/**
	 * Default constructor
	 */
	Book()
	{
		this.pages = 0;
        this.name = "Not given";
        this.price = 0.0;
	}
	
	/**
	 * Overloaded constructor
	 */
	Book(int pages, String name, double price) {
        this.pages = pages;
        this.name = name;
        this.price = price;
	}
	
	/**
	 * Getter function for pages
	 */
	public int getPages()
	{
		return this.pages;
	}
	
	/**
	 * Getter function for name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Getter function for price
	 */
	public double getPrice()
	{
		return this.price;
	}
	
	/**
	 * Setter function for pages
	 */
	public void setPages(int a_pages) {
		this.pages = a_pages;
	}
	
	/**
	 * Setter function for name
	 */
	public void setName(String a_name) {
		this.name = a_name;
	}
	
	/**
	 * Setter function for price
	 */
	public void setPrice(double a_price) {
			this.price = a_price;
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
		Book book_one = new Book();
		Book book_two = new Book();
		Book book_three = new Book(378, "Intro to Java", 25.99);
		Book book_four = new Book(500, "Intro to Python", 22.99);
		System.out.println(book_one.toString());
        System.out.println(book_two.toString());
        System.out.println(book_three.toString());
        System.out.println(book_four.toString());	
	}
	
}