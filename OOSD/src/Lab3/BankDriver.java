package Lab3;

public class BankDriver 
{
	public static void main(String[] args) 
	{
		SavingsAccount saver1 = new SavingsAccount();
		saver1.setSavingsBalance(2000.00);
		
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		///Set Interest to 4%
		SavingsAccount.modifyInterestRate(0.04f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println(saver1);
		System.out.println(saver2.toString());
		
		///Set Interest to 5%
		SavingsAccount.modifyInterestRate(0.05f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println(saver1);
		System.out.println(saver2.toString());
	}
}
