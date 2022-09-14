public class TestCow
{
	public static void main(String[] args)
	{
		Cow c1 = new Cow();
		c1.name="hasu 1";
		System.out.println("Name of c1 hasu:"+c1.name);
		c1.moo();
		Cow c2=c1;
		c2.name="hasu 2";
		c1.moo();
		Cow c3=c2;
		c3.name="hasu 3";
		c3.moo();
	}
}