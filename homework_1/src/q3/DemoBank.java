package q3;

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCustomers bc = new BankCustomers();
		BankAccounts ba = new BankAccounts();
		
		bc.setFirstname("Shrey");
		bc.setLastname("Malaviya");
		System.out.println(bc);
		
		ba.setCustomer(bc.getFirstname());
		ba.setBalance(0);
		System.out.println(ba);
	}

}
