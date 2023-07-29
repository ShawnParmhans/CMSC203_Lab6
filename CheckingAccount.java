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

public class CheckingAccount extends BankAccount
{
	private static final double FEE = .15;
	
	public CheckingAccount(String name, double initialAm)
	{
		super(name, initialAm);
		setAccountNumber(getAccountNumber() + "-10");
		
	}
	
	@Override
	public boolean withdraw(double w)
	{
		double Withdraw = w + FEE;
		boolean completed = super.withdraw(Withdraw);
		return completed;
	}
}
