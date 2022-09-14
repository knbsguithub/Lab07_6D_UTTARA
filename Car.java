/*07)*Important problem* Cars can be started, driven, reversed or 
stopped. You have to start the car to drive/reverse/stop it. When car is 
being driven / reversed, the fuel reduces. Once the car has no fuel, the 
car stops. Every car has a name. Write a tester class to test cars. How 
to know whether the car has started and then only being asked to be 
driven? Try to design on paper first and then see the below design. 
Understand how state can impact behaviour.*/

public class Car
{
	String name;
	float fuelQty;
	boolean isStarted;
	
	public void start()
	{
		if(fuelQty>0)
			isStarted=true;
		if(isStarted)
			System.out.println("CAR STARTED....");
		else
			System.out.println("Insuffient Fuel");
	}
	public void drive()
	{
		if(isStarted)
		{
			System.out.println("car is moving");
			fuelQty=fuelQty-1;
		}
		System.out.println("FUEL STATUS:"+fuelQty);
		if(fuelQty==0)
			stop();
		
	}
	public void reverse()
	{
		if(isStarted)
		{
			System.out.println("car is in R");
			fuelQty=fuelQty-1;
		}
		System.out.println("FUEL STATUS:"+fuelQty);
		if(fuelQty==0)
			stop();
	}
	public void stop()
	{
		isStarted=false;
		System.out.println("CAR STOPED....");
		 
	}
	
}