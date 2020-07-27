package com.wipro.ccbill.entity;
import java.util.Date;
import com.wipro.ccbill.exception.InputValidationException;
public class CreditCardBill 
{
	private String creditCardNo;
	private String customerId;
	private Date billDate;
	private Transaction monthTransactions[];
	public CreditCardBill()
	{
		super();
	}
	
	public CreditCardBill(String creditCardNo,String customerId,Date billDate,Transaction monthTransactions[])
	{
		this.creditCardNo=creditCardNo;
		this.customerId=customerId;
		this.billDate=billDate;
		this.monthTransactions=monthTransactions;
	}
	
	public double getTotalAmount(String transactionType)
	{
		double amount=0.0;
		if(!(transactionType.equals("DB")||transactionType.equals("CR")||transactionType.equals("EMI")))
			return 0.0;
		else
		{
			for(int i=0;i<monthTransactions.length;i++)
			{
				if(monthTransactions[i].getTransactionType().equals(transactionType))
					amount=amount+monthTransactions[i].getTransactionAmount();
				
			}
			return amount;
		}
	}
	
	public double calculateBillAmount()
	{
		try 
		{
			if(validateData().equals("valid"))
			{
				if(monthTransactions!=null && monthTransactions.length>0)
				{
					double amountSpend=getTotalAmount("DB");
					double emiamount=getTotalAmount("EMI");
					double amountPaid=getTotalAmount("CR");
					double outstanding=(amountSpend+emiamount)-amountPaid;
					double interest=(outstanding*19.9/100)/12;
					return outstanding+interest;
				}
				else
				{
					return 0.0;
				}
			}
		}
		catch(InputValidationException e)
		{
			return 0.0;
		}
		return 0.0;
    }
	
	public String validateData() throws InputValidationException
	{
			if(!(creditCardNo!=null && creditCardNo.length()==16 && customerId!=null && customerId.length()>=6))
					 throw new InputValidationException();
			else
				return("valid");
	}

}
	