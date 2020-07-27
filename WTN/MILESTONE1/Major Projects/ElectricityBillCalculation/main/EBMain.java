package com.wipro.eb.main;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;
import com.wipro.eb.service.ConnectionService;
public class EBMain 
{
	public static void main(String[] args) throws InvalidReadingException, InvalidConnectionException 
	{
		ConnectionService c = new ConnectionService();
		// Domestic Testing
		System.out.println(c.generateBill(130, 120, "Domestic"));
		//Output bust be 23.0
		System.out.println(c.generateBill(180, 120, "Domestic"));
		//Output bust be 157.0
		System.out.println(c.generateBill(280, 120, "Domestic"));
		//Output bust be 655.0
		System.out.println(c.generateBill(-280, 120, "Domestic"));
		//Output bust be Incorrect Reading
		System.out.println(c.generateBill(280, -120, "Domestic"));
		//Output bust be Incorrect Reading
		System.out.println(c.generateBill(100, 120, "Domestic"));
		//Output bust be Incorrect Reading
		System.out.println(c.generateBill(200, 120, "domestic"));
		//Output bust be Invalid ConnectionType
		System.out.println(c.generateBill(200, 120, "dom"));
		//Output bust be Invalid ConnectionType
		
		//Commercial Testing
		System.out.println(c.generateBill(130, 120, "Commercial"));
		//Output bust be 53.04
		System.out.println(c.generateBill(180, 120, "Commercial"));
		//Output bust be 334.56
		System.out.println(c.generateBill(280, 120, "Commercial"));
		//Output bust be 1119.96
		System.out.println(c.generateBill(-280, 120, "Commercial"));
		//Output bust be Incorrect Reading
		System.out.println(c.generateBill(280, -120, "Commercial"));
		//Output bust be Incorrect Reading
		System.out.println(c.generateBill(100, 120, "Commercial"));
		//Output bust be Incorrect Reading
		System.out.println(c.generateBill(200, 120, "commercial"));
		//Output bust be Invalid ConnectionType
		System.out.println(c.generateBill(200, 120, "comm"));
		//Output bust be Invalid ConnectionType		
	}

}
