public class TestCar
{
	public static void main(String[] args)
	{
		System.out.println("Testing Car....");
		Car c1=new Car();
		c1.name="Lamborghini";
		System.out.println("Car Name:"+c1.name);
		c1.fuelQty=10;
		c1.start();
		c1.drive();
		c1.reverse();
		c1.stop();
	}
}