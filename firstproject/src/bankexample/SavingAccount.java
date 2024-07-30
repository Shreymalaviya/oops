package bankexample;

public class SavingAccount extends BankAccount{
	@Override
	public void deposite() {
		System.out.println("deposite 10000");
	}
	
	@Override
	public void withdraw() {
		System.out.println("withdraw 5000");
	}
}
