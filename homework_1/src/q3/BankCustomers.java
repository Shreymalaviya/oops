package q3;

class BankCustomers {
	private String firstname, lastname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "BankCustomers [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
}

class BankAccounts {
	private String customer;
	private double balance;
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "BankAccounts [customer=" + customer + ", balance=" + balance + "]";
	}
	
	
}