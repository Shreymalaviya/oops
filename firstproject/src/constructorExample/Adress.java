package constructorExample;

public class Adress {
	String societyName,area;
	int pincode;
	
	//default constructor
	public Adress() {
		this.area = "Shela";
	}
	
	//parameterized constructor
	public Adress(String societyName, String area, int pincode) {
		this.societyName = societyName;
		this.area = area;
		this.pincode = pincode;
	}

	//setter getter
	public String getSocietyName() {
		return societyName;
	}
	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Adress [societyName=" + societyName + ", area=" + area + ", pincode=" + pincode + "]";
	}
}