package com.wipro.eb.entity;

public class Commercial extends Connection
{

	public Commercial(int previousReading, int currentReading, float[] slabs) 
	{
		super(previousReading, currentReading, slabs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float computeBill() 
	{
		int units=currentReading-previousReading;
		float billamount;
		if(units<50)
		{
			billamount=units*slabs[0];
		}
		else if(units<100)
		{
			billamount=(float) ((50*slabs[0])+((units-50)*slabs[1]));
		}
		else
		{
			billamount=(float) ((50*slabs[0])+(50*slabs[1])+((units-100)*slabs[2]));
		}
		float electricityduty=0.0f;
		if(billamount>=10000)
		{
			electricityduty=(float)(billamount*0.09);
		}
		else if(billamount>=5000)
		{
			electricityduty=(float)(billamount*0.06);
		}
		else
		{
			electricityduty=(float) (billamount*0.02);
		}
		billamount+=electricityduty;
		return billamount;
	}

}
