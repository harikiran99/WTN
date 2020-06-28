import java.util.*;
public class H
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
		{
			System.out.println("Alphabet ");
		}
		else if(ch>=48&&ch<=57)
		{
			System.out.println("Number ");
		}
		else
		{
			System.out.println("Special Character ");
		}
		sc.close();
	}
	

}
