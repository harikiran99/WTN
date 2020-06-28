import java.util.Scanner;
public class Project1
{
	public static void main(String[] args)
	{
		// TO DO Auto-generated method stub
		int[] empid=new int[] {1001,1002,1003,1004,1005,1006,1007};
		String[] empname=new String[]                 {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String[] joindate=new String[]     {"01/04/2009","23/08/2012","12/11/2008","29/01/2003","16/07/2005","1/1/2000","12/06/2006"};
		char[] designationcode=new char[] {'e','c','k','r','m','e','c'};
		String[] dept=new String[] {"R&D","PM","Acct","Front                 Desk","Engg","Manufacturing","PM"};
		int[] basic=new int[] {20000,30000,10000,12000,50000,23000,29000};
		int[] hra=new int[] {8000,12000,8000,6000,20000,9000,12000};
		int[] it=new int[] {3000,9000,1000,2000,20000,4400,10000};
		int user_query;
		double salary;
		int len;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee ID:");
		user_query=sc.nextInt();
		len=empid.length;
		int pos=0;
		String designation=null;
		int da=0;
		char a;
		int flag=0;
		for(int i=0;i<len;i++)
		{
			if(user_query==empid[i])
			{
				 flag=0;
				 pos=i;
				 a=designationcode[i];
				 switch(a)
				 {
				 case 'e': designation="Engineer";
				 		   da=20000;
				 case 'c': designation="Consultant";
				 		   da=32000;
				 case 'k': designation="Clerk";
				 		   da=12000;
				 case 'r': designation="Receptionist";
				 		   da=15000;
				 case 'm': designation="Manager";
				 		   da=40000;
				 }
				 salary=basic[i]+hra[i]+da-it[i];
				 System.out.println("Emp No.      Emp Name      Department     Designation      Salary");
				 System.out.println(empid[i]+"         "+empname[i]+"        "+dept[i]+"         "+  designation+"          "+salary);
				 break;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("There is no employee with empid: "+user_query);
		}
	}
}