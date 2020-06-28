import java.util.Scanner;

public class P9 {
	public static void main(String[] args) 
	{
		String a;
		String b;
		StringBuffer sb=new StringBuffer();
		int len=0;
		Scanner sc=new Scanner(System.in);
		a=sc.next();
		b=sc.next();
		sc.close();
		if(a.length()>=b.length())
		{
			len=a.length();
		}
		else
		{
			len=b.length();
		}
		for(int i=0;i<len;i++)
		{
			if(i<a.length())
			{
				sb.append(a.charAt(i));
			}
			if(i<b.length())
			{
				sb.append(b.charAt(i));
			}
		}
		System.out.println(sb);
	}
}