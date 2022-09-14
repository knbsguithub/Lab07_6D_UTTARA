public class TestPerson
{
	public static void main(String[] args)
	{
		Person p1=new Person();
		p1.name="VIKRANT RONA";
		p1.age=32;
		System.out.println("My name is "+p1.name+" and my age is "+p1.age);
		p1.eat();
		p1.sleep();
		Person p2=new Person();
		p2.name="JANARDHAANA GAMBIRA";
		p2.age=62;
		System.out.println("My name is "+p2.name+ " and my age is " +p2.age);
		p2.eat();
		p2.sleep();
		
		//
		
		for(int i=0;i<10;i++)
		{
			Person p3=new Person();
			//System.out.println(p3);
		}
		System.out.println(p3);
	}
}