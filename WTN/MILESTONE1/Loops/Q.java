import java.util.Scanner;
public class Q
{
	public static void main(String args[])
	{
		int n;
		int i;
		int count=0;
		Scanner sc=new Scanner(System.in);
		try
		{
			n=sc.nextInt();
			if(n==1||n==0)
			{
			 System.out.println(n+" is neither prime nor composite");
			}
			else
			{
				for(i=1;i<=n/2;i++)
				{
					if(n%i==0)
					{
						count+=1;
					}
				}
				count+=1;
				if(count==2)
				{
				 System.out.println(n+" is a prime number");
				}
				else 
				{
				 System.out.println(n+" is not a prime number");
				}
			}
		}
		catch(Exception e)
		{
		 System.out.println("Please enter an integer number");
		}
         	sc.close();
	}
}
