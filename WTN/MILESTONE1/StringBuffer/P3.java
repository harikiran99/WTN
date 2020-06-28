import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		String s;
		int len;
		Scanner sc=new Scanner(System.in);
		sb.append(sc.nextLine());
		sc.close();
		s=sb.substring(0,2);
		len=sb.length();
		for(int i=0;i<len;i++)
		{
			System.out.print(s);
		}
	}

}