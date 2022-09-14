/*1) Create a Duck. A Duck has a tailSize (int). A Duck can swim.
When you ask a Duck to swim, it says so (print to monitor). Design
and test Duck class usage as we did for Hippo. Create 2 Duck objects in 
tester class (TestDuck->main()), with 2 references pointing to it (lets say 
d1,d2). Set the tailSize states to 10 and 20. Invoke d1.swim() & 
d2.swim(). Compile, run and test your understanding so far. Now make 
d1.size = d2.size. SOP d1.size and d2.size to monitor. What has 
changed and why? Now make d1.size = 30. SOP d1.size and d2.size to 
monitor. What has changed and why? Now make d1=d2. SOP d1.size 
and d2.size to monitor. What has changed and why? Now make 
d1=d2=null. Can you access any of the 2 objects now? Now do d1= new 
Duck(); How many objects are reachable? Do you understand the 
answers to all the questions? If not, please ask.*/

public class Duck
{
	int tailSize;
	
	public void swim()
	{
		System.out.println("ducks can swim");
	}
} 