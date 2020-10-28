package Lab3;

import java.util.Arrays;

public class BankCustomer 
{
	///Variables
	private String name;
	private String address;
	private SavingsAccount[] savacc = new SavingsAccount[3];
	private int noOfAccs = 0;
	
	///Constructors
	public BankCustomer(String name, String address) 
	{
		setName(name);
		setAddress(address);
	}
	
	///Getters & Setters
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public SavingsAccount[] getSavacc() 
	{
		return savacc;
	}
	public void setSavacc(SavingsAccount[] savacc) 
	{
		this.savacc = savacc;
	}
	public int getNoOfAccs() 
	{
		return noOfAccs;
	}
	public void setNoOfAccs(int noOfAccs) 
	{
		this.noOfAccs = noOfAccs;
	}

	///Misc Methods
	public void addAccount(SavingsAccount sav)
	{
		if(getNoOfAccs() <= 2)
		{
			savacc[getNoOfAccs()] = sav;
			setNoOfAccs(getNoOfAccs() + 1);
		}
		else
		{
			System.out.println("You have reached the maximum no. of accounts");
		}
	}
	
	public double balance(SavingsAccount[] savaccs)
	{
		double balance = 0;
		for(SavingsAccount sav: savaccs)
		{
			if(sav != null) balance += sav.getSavingsBalance();
		}
		return balance;
	}

	///toString
	@Override
	public String toString() 
	{
		return "BankCustomer [name = " + name + ", address = " + address + ", savacc = " + Arrays.toString(savacc) + "]";
	}
}
