package Lab3;

public class BankDriver 
{
	public static void main(String[] args) 
	{
		///Creates two saver accounts
		SavingsAccount saver1 = new SavingsAccount();
		saver1.setSavingsBalance(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		///assigns interest rate
		SavingsAccount.modifyInterestRate(0.05f);
		///Calculates monthly interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		///Adds accounts to customer
		BankCustomer bc = new BankCustomer("Conor","Laois");
		bc.addAccount(saver1);
		bc.addAccount(saver2);

		System.out.println(bc);
		System.out.println("Savings Total = " + bc.balance(bc.getSavacc()));
	}
}
