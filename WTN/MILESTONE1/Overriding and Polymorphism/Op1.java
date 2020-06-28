class Fruit
{
	String name;
	String taste;
	int size;
	void eat()
	{
		System.out.print("Name of the fruit: "+name);
		System.out.print("Taste of the fruit: "+taste);
		System.out.print("Size of the fruit: "+size);
	}
}
class Apple extends Fruit
{
	Apple(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println("Name of the fruit: "+name);
		System.out.println("Taste of the fruit: "+taste);
	}
}
class Orange extends Fruit
{
	Orange(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println("Name of the fruit: "+name);
		System.out.println("Taste of the fruit: "+taste);
	}
}
public class Op1 
{

	public static void main(String[] args)
	{
		
		Apple a=new Apple("Kashmir Apple","Sweet",2);
		a.eat();
		Orange o=new Orange("Blood Orange","Intense",1);
		o.eat();
	}

}