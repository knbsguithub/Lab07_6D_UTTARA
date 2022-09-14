/*2)There are Cows. A Cow has a name and can moo. When you ask a 
Cow to moo, it shouts out its name. Design a class for Cow and the 
tester code. After testing if cows work correctly, create 2 references and 
then point to same object. Verify what happens if you change the state 
of the object using one ref when you invoke behaviour using the second.
*/
public class Cow
{
	String name;
	public void moo()
	{
		System.out.println("hello i m "+name+" i mooooo");
	}
}