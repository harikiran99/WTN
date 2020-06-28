class Author
{
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender) 
	{
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public char getGender() 
	{
		return gender;
	}
	public void setGender(char gender) 
	{
		this.gender = gender;
	}
	
}
class book
{
	private String name;
	private Author a=new Author("naveen","bigbot@bot.com",'G');
	private double price;
	private int qtyInStock;
	public book(String name, String author, double price, int qtyInStock) 
	{
		super();
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName() 
	{
		return name;
	}
	
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public int getQtyInStock() 
	{
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) 
	{
		this.qtyInStock = qtyInStock;
	}
	public void getAuthor()
	{
		System.out.println("The name of the author is :"+a.getName());
		System.out.println("The email is :"+a.getEmail());
		System.out.println("The gender: "+a.getGender());
	}
}
public class books
{
	public static void main(String args[])
	{
		book b=new book("JAVA","naveen", 55.66, 100);
		
		System.out.println("The name of the book is "+b.getName());
		System.out.println("The Price of the book is "+b.getPrice());
		System.out.println("The stock of the book is "+b.getQtyInStock());
		b.getAuthor();
	}
}
© 2020 GitHub, Inc.