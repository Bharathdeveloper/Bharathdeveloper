package inheritance;

public class Bankaccount {
	String accountName;
	String accountNumber;
	double Balance=3000;
	public Bankaccount(String accountName,String accountNumber)
	{
		this.accountName=accountName;
		this.accountNumber=accountNumber;
	}
	void getAccountName()
	{
		System.out.println(accountName);
		
	}
	void getAccountNumber()
	{
		System.out.println(accountNumber);
	}
	void getBalance()
	{
		System.out.println(Balance);
		
	}
	double deposit(double amount)
	{
		
		Balance=Balance+amount;
			return Balance;
		
	}		
	boolean  withdraw(double amount)
	{
		if(Balance>amount)
		{    
			Balance=Balance-amount;
			System.out.println("yes there is a balance");
			return true;
		}
		
		   return false;
	}
}	


