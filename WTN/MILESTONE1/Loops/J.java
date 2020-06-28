import java.util.Scanner;
public class J
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		char converted;
		if(Character.isLowerCase(ch))
		{
			converted=Character.toUpperCase(ch);
			System.out.println("Before Coversion "+ch+"\nAfter Conversion "+converted);
		}
		else if(Character.isUpperCase(ch))
		{
			converted=Character.toLowerCase(ch);
		System.out.println("Before Coversion "+ch+"/nAfter Conversion "+converted);
			
		}
		else
		{
			System.out.println("Invalid Entry");
		}
		sc.close();
	}

}
