package org.tnsif.employeechecking;

import org.tnsif.employeemanagement.Designation;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Designation d = new Designation();
		d.setDesig("Developer");
		d.setDesc("JAVA Devaloper");
		
		System.out.println(d.getDesig());
		System.out.println(d.getDesc());
	}

}
