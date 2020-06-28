import java.util.Scanner;

public class P6 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a;
		String b;
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		a=sc.next();
		b=sc.next();
		if(a.length()>b.length())
		{
			sb.append(b);
			sb.append(a);
			sb.append(b);
		}
		else if(b.length()>a.length())
		{
			sb.append(a);
			sb.append(b);
			sb.append(a);
		}
		System.out.println(sb);
	}
}