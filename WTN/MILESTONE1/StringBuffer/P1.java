import java.util.Scanner;

public class p1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String rev="";
		sc.close();
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(rev.equals(s1))
		{
			System.out.println("Palindrome String: "+s1);
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}