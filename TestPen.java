public class TestPen
{
	public static void main(String[] args)
	{
		Pen p1 = new Pen();
		p1.inkQty = 0;
		p1.color="RED";
		p1.refill(15);
		p1.write("PowerFull People Makes Places PowerFull (inked in "+p1.color+")");
		System.out.println(p1.inkQty);
	}
}