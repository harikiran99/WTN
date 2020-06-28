import java.util.*;
public class R
{
	public static void main(String args[])
	{
		int n;
		int sum=0;
		int duplicate;
		int rem=0;
		int length;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		duplicate=n;
		length = (int)(Math.log10(n)+1);
		for(int i=0;i<length;i++)
		{
			rem=duplicate%10;
			duplicate=duplicate/10;
			sum=sum+rem;
		}
		System.out.println(sum);
		sc.close();
	}

}
