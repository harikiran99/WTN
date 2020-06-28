import java.util.Scanner;

public class p8 
{
	public static void main(String args[])
	{
		int n;
		int count=0;
		int max=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int ele=a[0];
		sc.close();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count+=1;
					if(count>max)
					{
						max=count;
						ele=a[i];
					}
				}
			}
		}
		System.out.println(ele);
	}
}