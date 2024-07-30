package cunstructor_inheritance;

public class Vehicle {
	private String company;
	
	public Vehicle() {
		this.company = "Totoya";
	}
	
	public Vehicle(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return company;
	}
	
}
