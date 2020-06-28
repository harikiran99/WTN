public class O 
{
	public static void main(String args[])
	{
		int n;
		int count=0;
		n=Integer.parseInt(args[0]);
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				count+=1;
			}
		}
		count+=1;
		if(count==2)
		{
			System.out.println("Given number is prime "+n);
		}
		else
		{
			System.out.println("Given number is not a prime number");
		}
	}

}
