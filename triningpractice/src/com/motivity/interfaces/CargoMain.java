package com.motivity.interfaces;

class AntonovAn225Mriya extends Cargo
{
	String fightname;
	public AntonovAn225Mriya(String flighttype,String flightname)
	{
		this.fightname=flightname;
		super.flighttype = flighttype;
		
	}
	public String toString() {
		return "AntonovAn225Mriya [fightname=" + fightname + ", flighttype=" + flighttype + "]";
	}
	public void route()
	{	
		System.out.println("route : miyanmar to russia");
		
	}
	public void time() 
	{
		System.out.println("time : 10 hrs....");
	}
	void maxVolume() 
	{
		System.out.println("volume : 3000 cubic tones....");
	}
	
}
class Boing70 extends Cargo
{
	String fightname;
	public Boing70(String flighttype,String flightname)
	{
		this.fightname=flightname;
		super.flighttype = flighttype;
		
	}
	public String toString() {
		return "Boing70 [fightname=" + fightname + ", flighttype=" + flighttype + "]";
	}
	public void route()
	{	
		System.out.println("route : india to us");
		
	}
	public void time() 
	{
		System.out.println("time : 28 hrs....");
	}
	void maxVolume() 
	{
		System.out.println("volume : 4000 cubic tones....");
	}
}

public class CargoMain
{
	
	
	public static void main(String[] args)
	{
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
