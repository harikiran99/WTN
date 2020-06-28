import java.util.*;
public class P3
{
	public static void main(String args[])
	{
		int n;
		int i;
		int e;
		int flag=0;
		int pos=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		e=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(e==a[i])
			{
				flag=1;
				pos=i+1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("Element found "+pos);
		}
		else
		{
			System.out.println("-1");
		}
		sc.close();
	}
}