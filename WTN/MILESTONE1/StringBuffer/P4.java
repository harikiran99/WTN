import java.util.Scanner;

public class P4 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s;
		int len;
		String ans;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		sc.close();
		len=s.length();
		if(len%2==0)
		{
			ans=s.substring(0,len/2);
		}
		else
		{
			ans=null;
		}
		System.out.print(ans);
	}
}