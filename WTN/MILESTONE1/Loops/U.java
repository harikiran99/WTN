import java.util.Scanner;
public class U
{
	public static void main(String args[])
	{
		int n;
		int rev = 0;
		int rem;
		int dup=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		dup=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(dup==rev)
		{
			System.out.println(dup+" is a palindrome");
		}
		else
		{
			System.out.println(dup+" is not a palindrome");
		}
		sc.close();
		
	}

}
