package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;
public class BankService 
{
	public boolean validateData(float principal, int tenure,int age, String gender) throws BankValidationException
	{
		boolean a=true;
		try {
		if((principal>=500)&&(tenure==5||tenure==10)&&(gender.equals("Male")||gender.equals("Female"))&&(age>1&&age<100))
		{
			a=true;
		}
		else
		{
			a=false;
			throw new BankValidationException();
		}
	}
	catch(Exception e)
	{	
		System.out.println(e);
	}
		return a;
	}
	
	public void calculate(float principal,int tenure,int age,String gender) throws BankValidationException
	{
		boolean b;
		int rateOfInterest=0;
		b=validateData(principal,tenure,age,gender);
		if(b==true)
		{
			RDAccount a=new RDAccount(tenure,principal);
			a.setInterest(age,gender);
			float totalamount=a.calculateAmountDeposited();
			System.out.println("Interest is: "+a.calculateInterest());
			System.out.println("Amount Deposited is: "+totalamount);
			System.out.println("Maturity Amount is: "+a.calculateMaturityAmount(totalamount,a.calculateInterest()));
			
		}
	}
	
}
