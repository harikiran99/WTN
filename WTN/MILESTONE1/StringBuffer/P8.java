import java.util.Scanner;

public class P8 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s;
		int index;
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		s=sc.next();
		sc.close();
		index=s.indexOf('*');
		sb.append(s.substring(0,index-1));
		sb.append(s.substring(index+2,s.length()));
		System.out.println(sb);
		
	}

}