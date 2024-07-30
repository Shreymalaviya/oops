package cunstructor_inheritance;

public class TwoWheeler extends Vehicle {
	private String FuelType;
	
	public TwoWheeler() {
		super();
		this.FuelType = "Petrol";
	}
	
	public TwoWheeler(String fuelType,String cm) {
		super(cm);
		FuelType = fuelType;
	}

	@Override
	public String toString() {
		return FuelType + super.toString();
	}
	
}
