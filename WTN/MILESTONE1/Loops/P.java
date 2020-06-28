public class P
{
	public static void main(String args[])
	{
		int i;
		int j;
		int count=0;
		for(i=10;i<=99;i++)
		{
			for(j=1;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					count+=1;
				}
			}
			count+=1;
			if(count==2)
			{
				System.out.println(i);
			}
			count=0;
		}	
	}
}
