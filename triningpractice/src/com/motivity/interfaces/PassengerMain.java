package com.motivity.interfaces;

class Boing750 extends Passnger
{
	String flightname;
	
	public Boing750(String type,String name) 
	{
		super.flighttype = type;
		this.flightname =name;
	}
	

	
	@Override
	public String toString()
	{
		return "Boing750 [flightname=" + flightname + ", flighttype=" + flighttype + "]";
	}
	public void route() 
	{
	
		System.out.println("route : chennai to kolkatha");
		
	}
	void maxCapasity()
	{
		System.out.println("max capasity is 450 passengers....");
	}
	public void time() {
		System.out.println("total 8 hrs journy.....");
		
	}
	
}
class Indigo extends Passnger
{
String flightname;
	
	public Indigo(String type,String name) 
	{
		super.flighttype = type;
		this.flightname =name;
	}
	

	
	@Override
	public String toString()
	{
		return "Indigo [flightname=" + flightname + ", flighttype=" + flighttype + "]";
	}
	public void route() 
	{
	
		System.out.println("route : hyderabad to australia");
		
	}
	void maxCapasity()
	{
		System.out.println("max capasity is 950 passengers....");
	}
	public void time() {
		System.out.println("total 32 hrs journy.....");
		
	}
}


public class PassengerMain 
{
	public static void main(String[] args)
	{
		Passnger p1 = new Boing750("passneger", "boing750");
		System.out.println(p1);
		p1.maxCapasity();
		p1.route();
		p1.time();
		System.out.println("=======================");
		p1 = new Indigo("passenger", "Indigo");
		System.out.println(p1);
		p1.maxCapasity();
		p1.route();
		p1.time();
		System.out.println("========================");
		Cargo cargo = new AntonovAn225Mriya("cargo", "AntonovAn225Mriya");
		System.out.println(cargo);
		cargo.maxVolume();
		cargo.route();
		cargo.time();
		System.out.println("=======================");
		cargo = new Boing70("Cargo", "Boing70");
		System.out.println(cargo);
		cargo.maxVolume();
		cargo.route();
		cargo.time();
		
		
	}

}
