package com.wipro.eb.entity;

public class Domestic extends Connection
{
	public Domestic(int previousReading, int currentReading, float[] slabs) 
	{
		super(previousReading, currentReading, slabs);
		// TODO Auto-generated constructor stub
	}
	@Override
	public float computeBill() 
	{
		float billamount;
		int units=currentReading-previousReading;
		if(units<50)
		{
			billamount=units*slabs[0];
		}
		else if(units<100)
		{
			billamount=(float) (50*2.3+(units-50)*slabs[1]);
			
		}
		else
		{
			billamount=(float) ((50*slabs[0])+(50*slabs[1])+((units-100)*slabs[2]));
		}
		// TODO Auto-generated method stub
		return billamount;
	}

}
