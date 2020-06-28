class Author
{
	String name;
	String email;
	char gender;
	Author(String name, String email,char gender)
	{
		this.name = name;
		this.email = email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}	
	
}

class Book
{
	String name;
	Author author;
	double price;
	int qtystock;
	Book(String name, Author author, double price, int qtystock) 
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtystock = qtystock;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Author getAuthor()
	{
		return author;
	}
	public void setAuthor(Author author)
	{
		this.author = author;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getQtystock() 
	{
		return qtystock;
	}
	public void setQtystock(int qtystock)
	{
		this.qtystock = qtystock;
	}
	
}

public class Main 
{
	public static void main(String args[])
	{
		Author a=new Author("hemanth","hemanthsai457@gmail.com",'M');
		Book b=new Book("hero",a,10,1);
		System.out.println("Book Details:");
		System.out.println("Name of the book-> "+b.getName());
		System.out.println("Author of the book-> "+b.getAuthor().getName());
		System.out.println("Price of the book-> "+b.getPrice());
		System.out.println("Quantity of the book available-> "+b.getQtystock());
		System.out.println("-------------------");
		System.out.println("Author email-> "+b.getAuthor().getEmail());
		System.out.println("Author Gender-> "+b.getAuthor().getGender());
	}
}