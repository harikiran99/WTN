package com.wipro.ccbill.entity;
import java.util.Date;
public class Transaction 
{
	private String creditCardNo;
	private Date dateofTransaction;
	private String transactionDesc;
	private double transactionAmount;
	private String transactionType;
	int count;
	public Transaction() 
	{
		super();	
	}
	public Transaction(String creditCardNo,Date dateofTransaction,String transactionDesc,double transactionAmount,String transactionType)
	{
		this.creditCardNo=creditCardNo;
		this.dateofTransaction=dateofTransaction;
		this.transactionAmount=transactionAmount;
		this.transactionDesc=transactionDesc;
		this.transactionType=transactionType;
		
	}
	public String getCreditCardNo() 
	{
		return creditCardNo;
	}
	public void setCreditCardNo(String creditCardNo) 
	{
		this.creditCardNo = creditCardNo;
	}
	public Date getDateofTransaction() 
	{
		return dateofTransaction;
	}
	public void setDateofTransaction(Date dateofTransaction) 
	{
		this.dateofTransaction = dateofTransaction;
	}
	public String getTransactionDesc() 
	{
		return transactionDesc;
	}
	public void setTransactionDesc(String transactionDesc)
	{
		this.transactionDesc = transactionDesc;
	}
	public double getTransactionAmount() 
	{
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) 
	{
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionType() 
	{
		return transactionType;
	}
	public void setTransactionType(String transactionType) 
	{
		if(transactionType.equals("DB"))
		{
			count++;
		}
		this.transactionType = transactionType;
	}
}
