import java.util.Scanner;

public class p7 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s;
		StringBuffer sb=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		sc.close();
		if(s.charAt(0)=='x'&&s.charAt(s.length()-1)=='x')
		{
			sb.append(s.substring(1, s.length()-1));
		}
		else
		{
			sb.append(s);
		}
		System.out.println(sb);
	}
}