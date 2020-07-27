package com.wipro.eb.service;
import com.wipro.eb.entity.Commercial;
import com.wipro.eb.entity.Domestic;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;

public class ConnectionService 
{
	public boolean validate(int currentReading,int previousReading,String type)throws InvalidReadingException,InvalidConnectionException
	{
		boolean b=true;
		if((currentReading<previousReading)||(currentReading<0)||(previousReading<0))
		{
			b=false;
			throw new InvalidReadingException();
		}
		else if(!((type.equalsIgnoreCase("Domestic"))||type.equalsIgnoreCase("Commercial")))
		{
			b=false;
			throw new InvalidConnectionException();
		}
		return b;
	}
	
	public float calculateBillAmt(int currentReading, int previousReading, String type) throws InvalidReadingException, InvalidConnectionException
	{
		float bill = 0;
		try
		{
			if(validate(currentReading,previousReading,type))
			{	
				if(type.equalsIgnoreCase("Commercial"))
				{
					float[] slabs = {5.2f, 6.8f, 8.3f};
					Commercial c=new Commercial(previousReading,currentReading,slabs);
						bill=c.computeBill();
				}
				else if(type.equalsIgnoreCase("Domestic"))
				{
					float[] slabs = {2.3f, 4.2f, 5.5f};
					Domestic d=new Domestic(previousReading,currentReading,slabs);
					bill=d.computeBill();
				}
			}
		}
		catch(InvalidReadingException e1)
		{
			return -1;
		}
		catch(InvalidConnectionException e2)
		{
			return -2;
		}
		return bill;
	}
	
	public String generateBill(int currentReading, int previousReading, String type) throws InvalidReadingException, InvalidConnectionException
	{
		float a=calculateBillAmt(currentReading,previousReading,type);
		if(a==-1f)
		{
			return "Incorrect Reading";
		}
		else if(a==-2f)
		{
			return "Invalid ConnectionType";
		}
		else 
		{
			return("Amount to be paid is "+a);
		}
	}
}
