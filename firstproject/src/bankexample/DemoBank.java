package bankexample;

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount();
		sa.deposite();
		sa.withdraw();
		
		CurrentAccount ca = new CurrentAccount();
		ca.deposite();
		ca.withdraw();
	}

}
