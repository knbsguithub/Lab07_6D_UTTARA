public class TestAccount
{
	public static void main(String[] args)
	{
		Account a1=new Account();
		a1.num="KARB40070101";
		a1.owner="KARTHIK A N";
		a1.balance=420840.420;
		a1.checkBalance();
		System.out.println();
		a1.withdraw(8400.73);
		System.out.println();
		a1.credit(1478.54);
		System.out.println();
		a1.checkBalance();
	}
}