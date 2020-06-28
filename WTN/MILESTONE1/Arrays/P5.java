import java.util.*;
public class P5 
{
	public static void main(String args[])
	{
		int n;
		int i;
		int j=0;
		int[] a=new int[] {100,50,900,10,4,60};
		n=a.length;
		Arrays.sort(a);
		for(i=0;i<2;i++)
		{
			System.out.println("smallest number"+(i+1)+" "+a[i]);
		}
		for(i=n-1;i>n-3;i--)
		{
			System.out.println("largest number"+(j+1)+" "+a[i]);
			j++;
		}
	}
}