import java.util.Scanner;
public class P5 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer(sc.next());
		sc.close();
		StringBuffer ans=new StringBuffer();
		ans.append(sb.substring(1,sb.length()-1));
		System.out.println(ans);
	}
}