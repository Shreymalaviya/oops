package org.tnsif.employeemanagement;

public class Designation {
	private String desig;
	private String desc;
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Designation [desig=" + desig + ", desc=" + desc + "]";
	}
	
}
