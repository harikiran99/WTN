public class p10 
{
	public static void main(String args[])
	{
		try {
		int i;
		int k=0;
		int[][] a=new int[2][2];
		for(i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=Integer.parseInt(args[k]);
				k++;
			}
		}
		for(i=1;i>=0;--i)
		{
			for(int j=1;j>=0;--j)
			{
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
	}
		catch(Exception e)
		{
			System.out.println("Please enter 4 numbers");
		}
}
}