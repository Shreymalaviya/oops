package bankexample;

public class CurrentAccount extends BankAccount{
	@Override
	public void deposite() {
		System.out.println("deposite 20000");
	}
	
	@Override
	public void withdraw() {
		System.out.println("withdraw 1000");
	}
}
