import java.util.Scanner;
public class P10 
{
	public static void main(String args[])
	{
		String s;
		int index;
		int i;
		StringBuffer sb=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		index=sc.nextInt();
		sc.close();
		for(i=0;i<index;i++)
		{
			sb.append(s.substring(s.length()-index,s.length()));
		}
		System.out.println(sb);
	}

}