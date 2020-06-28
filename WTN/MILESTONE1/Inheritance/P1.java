class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
	void sleep()
	{
		System.out.println("Sleeping");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("The bird is eating");
	}
	void sleep()
	{
		System.out.println("The bird is sleeping");
	}
	void fly()
	{
		System.out.println("The bird is flying");
	}
}

public class p1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Animal a =new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.fly();
		b.sleep();
	}