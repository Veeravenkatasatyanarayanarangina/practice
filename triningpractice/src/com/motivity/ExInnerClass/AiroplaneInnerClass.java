package com.motivity.ExInnerClass;

import com.motivity.ExInnerClass.Airport.Luftansa;

class Airport
{
	void permisson()
	{
		System.out.println("Airport aouthority is given to permisson to take-off lufthansa Airlines....");
	}
	class Luftansa
	{
		void takeoff()
		{
			System.out.println("after the permisson lufthansa airlines are take off....... ");
		}
	}
	class Indigo
	{
		void land()
		{
			System.out.println("airport authority is gives clearense to indigo airlines for landing.....");
		}
	}
}
		
public class AiroplaneInnerClass 
{
	public static void main(String[] args)
	{
		Airport rgvinternational = new Airport();
		rgvinternational.permisson();
		Airport.Luftansa boing = rgvinternational.new Luftansa();
		boing.takeoff();
		Airport.Indigo aircraft = rgvinternational.new Indigo();
		aircraft.land();
		
	}

}
