import java.util.Scanner;

public class P1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int i;
		int sum=0;
		double avg=0.0;
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();  
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
		sc.close();
	}
}