public class TestDuck
{
	public static void main(String[] args)
	{
		System.out.println("Entering the TestDuck");
		Duck d1 = new Duck();
		System.out.println("Address value of d1:"+d1);
		Duck d2 = new Duck();
		System.out.println("Address value of d2:"+d2);
		d1.tailSize=10;
		System.out.println("D1 DUCK TAIL SIZE:"+d1.tailSize);
		d2.tailSize=20;
		System.out.println("D2 DUCK TAIL SIZE:"+d2.tailSize);
		d1.tailSize = d2.tailSize;
		System.out.println("After doing the d1.tailSize=d2.tailSize operation");
		//the value of the d2 will be assigned to d1 object 
		System.out.println("D1 DUCK TAIL SIZE:"+d1.tailSize);
		System.out.println("D2 DUCK TAIL SIZE:"+d2.tailSize);
		d1.swim();
		d2.swim();
		d1.tailSize=30;
		System.out.println("After assigning the d1.tailSize=30");
		System.out.println("D1 DUCK TAIL SIZE:"+d1.tailSize);
		System.out.println("D2 DUCK TAIL SIZE:"+d2.tailSize);
		d1=d2;//address of the d2 and d1 will be the same and hence its pointing to same object
		System.out.println("Address value of d1:"+d1);
		System.out.println("Address value of d2:"+d2);
		System.out.println("After doing the d1=d2 operation");
		System.out.println("D1 DUCK TAIL SIZE:"+d1.tailSize);
		System.out.println("D2 DUCK TAIL SIZE:"+d2.tailSize);
		d1=d2=null;
		System.out.println("After doing the d1=d2=null operation");
		System.out.println("D1 DUCK TAIL SIZE:"+d1.tailSize);
		System.out.println("D2 DUCK TAIL SIZE:"+d2.tailSize);
		/*Exception in thread "main" java.lang.NullPointerException: 
		Cannot read field "tailSize" because "<local1>" is null*/
	}
}