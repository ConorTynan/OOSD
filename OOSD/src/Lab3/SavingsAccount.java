package Lab3;

public class SavingsAccount 
{
	///Variables
	private int accNo; //one per object instance
	private static int nextAccNo; //shared by all object instances
	private static float annualInterestRate = 0.0f;
	private double savingsBalance;
	
	///Constructors
	///Assigns unique numbers to each account
	public SavingsAccount() 
	{
		++ nextAccNo;
		setAccNo(nextAccNo);
	}
	public SavingsAccount(double savingsBalance) 
	{
		++ nextAccNo;
		setAccNo(nextAccNo);
		setSavingsBalance(savingsBalance);
	}

	///Getters & Setters
	///Gets and returns each variable
	public int getAccNo() 
	{
		return accNo;
	}
	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}
	public static float getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public static void modifyInterestRate(float annualInterestRate)
	{
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	public double getSavingsBalance() 
	{
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) 
	{
		this.savingsBalance = savingsBalance;
	}
	
	///Misc Methods
	///Calculates monthly interest
	public void calculateMonthlyInterest()
	{
		savingsBalance+=((getSavingsBalance()*getAnnualInterestRate())/12);
	}

	///toString
	@Override
	public String toString() {
		return "SavingsAccount [accNo=" + accNo + ", savingsBalance=" + savingsBalance + "]";
	}
}
