/*8) There are Accounts. Every Account has a number (string), owner 
(string) and balance (double). You can withdraw(double amt), 
debit(doubt amt) and checkBalance(). When you withdraw, the balance 
should reduce accordingly. When you debit, the balance will increase 
accordingly. Code an Account class and test it by creating 2 account 
objects? How do you stop over withdrawal?*/

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
				System.out.println("Rs."+amt+" Amount Withdrawed :)");
		}
			
	}
	public void credit(double amt)
	{
		if(amt<0)
			System.out.println("ENTER A VALID AMOUNT");
		else
		{
			balance = balance+amt;
			System.out.println("Rs."+amt+" Amount Depostied Successfull :) ");
		}
	}
	public void checkBalance()
	{
		System.out.println("Name:"+owner);
		System.out.println("Account Number:"+num);
		System.out.println("Balance:Rs."+balance);
	}
}