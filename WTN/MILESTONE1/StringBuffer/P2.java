import java.util.Scanner;
public class P2 
{
	public static void main(String args[])
	{
		String sb = null;
		String s1;
		String s2;
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		int l1=s1.length()-1;
		s2=sc.next();
		sc.close();
		char a=s1.charAt(l1);
		char b=s2.charAt(0);
		System.out.println(a);
		System.out.println(b);
		if(a==b)
		{
			sb=s1.substring(0,s1.length()-2)+s2;
		}
		else if(a!=b)
		{
			sb=s1+" "+s2;
		}
		sb=sb.toLowerCase();
		System.out.println(sb);
	}

}