package relationshipsExample;

public class Adress {
	private String flatno, societname, area;
	private int pincode;
	public String getFlatno() {
		return flatno;
	}
	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}
	public String getSocietname() {
		return societname;
	}
	public void setSocietname(String societname) {
		this.societname = societname;
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
		return "Adress [flatno=" + flatno + ", societname=" + societname + ", area=" + area + ", pincode=" + pincode
				+ "]";
	}
}
