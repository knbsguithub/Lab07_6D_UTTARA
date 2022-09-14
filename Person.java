/*5) There are Persons. A person has a age, name. Persons can eat, 
sleep. A person sleeps more if his age is < 40 and eats less. If the 
persons age is >= 40, he sleeps less but eats more. Design a Person 
class and test it. 
Person
String name; 
int age;
public void eat() { 
if(age < 40) 
sdfsdkf 
else
adfkgldafgk 
}
public void sleep() { 
….
}*/

public class Person
{
	String name;
	int age;
	
	public void eat()
	{
		if(age>40)
			System.out.println("I Eat More");
		else
			System.out.println("I Eat Less");
	}
	
	public void sleep()
	{
		if (age<40)
			System.out.println("I Sleep more");
		else
			System.out.println("I Sleeps Less");
	}
}