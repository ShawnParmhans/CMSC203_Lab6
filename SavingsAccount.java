/*
 Class: CMSC203 CRN 40398
 Program: Lab 6
 Instructor: Farnaz Eivazi
 Summary of Description: Bank account extension
 Due Date: 07/31/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Shawn Parmhans
*/
public class SavingsAccount extends BankAccount
{
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double initialBal)
	{
		super(name, initialBal);
		accountNumber = (getAccountNumber() + "-" + savingsNumber);
	}
	
	public void postInterest()
	{
		double monthWorth = ((getBalance() * rate)/12);
		deposit(monthWorth);
	}
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
    public SavingsAccount(SavingsAccount oldAcc, double initialBalance) 
    {
        super(oldAcc, initialBalance);
        savingsNumber = oldAcc.savingsNumber + 1;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

}
