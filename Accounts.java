public class Account
{
	String num;
	String owner;
	double balance;
	
	public void withdraw(double amt)
	{
		if(amt<0)
			System.out.println("ENTER A VALID AMOUNT");
		else
		{
			if(amt>balance)
				System.out.println("INSUFFICIENT FUNDS :( ");
			else
				balance=balance-amt;
				System.out.println("Amount Withdrawed :)");
		}
			
	}
	public void credit(double amt)
	{
		if(amt<0)
			System.out.println("ENTER A VALID AMOUNT");
		else
		{
			balance = balance+amt;
			System.out.println("Amount Depostied Successfull :) ");
		}
	}
	public void checkBalance()
	{
		System.out.println("Name:"+owner);
		System.out.println("Account Number:"+num);
		System.out.println("Balance:"+balance);
	}
}