import java.util.Scanner;
public class P2
{
	public static void main(String args[])
	{
		int n;
		int i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int minValue=a[0]; 
	    for(i=0;i<n;i++)
	    { 
	        if(a[i]<minValue)
	        { 
	          minValue=a[i]; 
	        }
	    }
	    int maxValue =a[0]; 
	    for(i=0;i<n;i++)
	    { 
	      if(a[i]>maxValue)
	      { 
	         maxValue=a[i]; 
	      }
	    }
	    sc.close();
	    System.out.println("max: "+maxValue);
	    System.out.println("min: "+minValue);
	}
}