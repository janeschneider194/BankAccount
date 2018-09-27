/**
 * 
 * @author jane schneider
 *
 */
public class BankAccount
{
	//fields
		private String name;
		private int accountNum;
		private double balance;
		
	//constructors
	public BankAccount(String a, int b)
	{
		name = a;
		accountNum = b;
		balance = 0;
	}
	public BankAccount(String a, int b, double c)
	{
		name = a;
		accountNum = b;
		balance = c;
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
		return "AccountNum: " + accountNum + "\nName: " + name + "\nBalance: " + balance;
		
	}
	
}
