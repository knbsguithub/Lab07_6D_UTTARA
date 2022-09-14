/*4) A Pen has inkQty (int), colour (string) and can be used to write and 
refill. A text must be given for it to write. A quantity must be given to refill. 
If there is ink then the pen will write the text given to it (SOP). Refill 
works by taking in the int qty to add to the existing inkQty. First as a 
class designer, on paper apply OOAD and arrive at the class design. 
Then create the class implementation and create a tester class to create 
2 pen objects, give it inkQty and ask it to write. First code this on your 
own. If you cannot get it correctly, then see Pen.java and TestPen.java. 
Then fix the code and rerun. Do not see the code first.*/
public class Pen
{
	int inkQty;
	String color;
	
	
	public void write(String mem)
	{
		if(inkQty > 0)
		{
			System.out.println(mem);
		}
		else
		{
			System.out.println("Please refill your pen first");
		}
	}
	
	public void refill(int qty)
	{
		inkQty = inkQty+qty;
	}
}