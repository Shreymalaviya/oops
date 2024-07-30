package org.tnsif.employeemanagement;

public class Employee {
	private String empname;
	private String desig;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", desig=" + desig + "]";
	}
}
