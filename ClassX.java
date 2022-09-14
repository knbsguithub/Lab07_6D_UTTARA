/*3) Check if instance variables of type string, int and boolean are given 
default values. Check if local variables are given default values. 
How to do this? Create a class with 4 instance variables with String, 
boolean, int and boolean as datatypes. Create a Tester class with main 
where you create an object and using reference print the instance 
variable values to monitor using SOP.*/
public class ClassX
{
	int i;
	String str;
	boolean b;
	double d;
	public static void main(String[] args)
	{
		ClassX obj = new ClassX();
		System.out.println(obj.i);
		System.out.println(obj.str); 
		System.out.println(obj.b);
		System.out.println(obj.d);
	}
}