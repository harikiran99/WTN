import java.util.Arrays;

public class p6 
{
	public static void main(String args[])
	{
		int[] a=new int[] {100,1,500,23,19,70};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}