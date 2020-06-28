public class I
{
	public static void main(String args[])
	{
		int p=10000;
		double intrest=0.0;
		double intamt = 0.0;
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(gender.equals("female"))
		{
			if(age>=1&&age<=58)
			{
				intrest=8.2;
				intamt=p*intrest*1/100;
				
			}
			else if(age>=59&&age<=120)
			{
				intrest=7.6;
				intamt=p*intrest*1/100;
				
			}
		}
		else if(gender.equals("male"))
		{
			if(age>=1&&age<=60)
			{
				intrest=9.2;
				intamt=p*intrest*1/100;
			}
			else if(age>=61&&age<=120)
			{
				intrest=8.3;
				intamt=p*intrest*1/100;
			}
		}
		System.out.println("AGE: "+age);
		System.out.println("GENDER: "+gender);
		System.out.println("Intrest RATE: "+intrest);
		System.out.println("Intrest is: "+intamt);
	}

}
