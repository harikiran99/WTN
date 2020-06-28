public class p11 
{
	public static void main(String args[])
	{
		try {
		int i,j,max,k=0;
		int[][] a=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=Integer.parseInt(args[k]);
				k++;
			}
		}
		max=a[0][0];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println(max);
		}
		catch(Exception e)
		{
			System.out.println("Please Enter 9 integer numbers");
		}
	}

}