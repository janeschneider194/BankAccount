
public class BankAccount
{
	//fields
		private String name;
		private int accountNum;
		private double balance;
		
	//constructors
	public BankAccount(String name, int accountNum)
	{
		name = "jane";
		accountNum = 2000;
		balance = 0;
	}
	public BankAccount(String name, int accountNum, double balance)
	{
		name = "jane";
		accountNum = 2000;
		balance = 50.00;
	}
	//methods
	public void deposit(double amountDeposit)
	{
		balance = balance + amountDeposit;
	} 
	public void withdraw(double amountWithdraw)
	{
		balance = balance - amountWithdraw;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return "Balance: " + balance;
	}
	
}
