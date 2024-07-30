package firstproject;

public class Carrental {
	private int CarId;
	private String CarType;
	private float Rent;
	
	public void GetCar() {
		CarId = 1;
		CarType = "van";
	}
	
	public void GetRent() {
		switch (CarType) {
			case "small car":
				Rent = 1000;
				break;
			case "van":
				Rent = 800;
				break;
			case "SUV":
				Rent = 2500;
				break;
			default :
				Rent = 0;
				break;
		}	
			System.out.println(Rent);
			
	}	
	public void ShowCar() {
		System.out.println(CarId + CarType + Rent);
	}
}
