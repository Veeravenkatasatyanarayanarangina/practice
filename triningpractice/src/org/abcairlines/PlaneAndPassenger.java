package org.abcairlines;
class Company
{
	static String companyname = "Satya Airlines.....";
	
}
class Plane extends Company
{
	static int planeno  =102;
	int seatno;
	void  passengerDetails(int seatno)
	{
		
	}
}
class Teju extends Plane
{
	static String ticketno = "ABC-123H1";
	String name ="teju";
	void passengerDetails(int seatno)
	{
		this.seatno = seatno;
		System.out.println("passneger name : "+name);
		System.out.println("passenger tickent no = "+ticketno);
		System.out.println("passenger seat no : "+seatno);
		System.out.println("plane number : "+planeno);
		System.out.println("company name : "+companyname);
		
	}
}


public class PlaneAndPassenger 
{
	public static void main(String[] args) 
	{
		 Plane plane = new Teju();
		plane.passengerDetails(12);
		System.out.println("================");
	}

}
