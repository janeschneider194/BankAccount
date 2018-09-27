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
		a = name;
		b= accountNum;
		balance = 0;
	}
	public BankAccount(String a, int b, double c)
	{
		a = name;
		b = accountNum;
		c = balance;
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
