public class V
{
	public static void main(String args[])
	{
		int i=1;
		int count=0;
		while(i<=1000)
		{
			if((i%2==0&&i%3==0&&i%5==0)&&(count<5))
			{
				System.out.println(i);
				count+=1;
				i++;
			}
			else
			{
				i++;
			}
		}
	}

}
