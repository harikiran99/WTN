import java.util.*;
public class p7
{
    public static void main(String[] args)
    {
    	int i;
    	int j;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=-9999978;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]!=9999978)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}