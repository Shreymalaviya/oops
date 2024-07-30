package firstproject;

public class Student {
	private int rollno;
	private String name;
	
	public void getdata() {
		rollno = 27;
		name = "Shreyansh";
	}
	
	public void display() {
		System.out.println(name + rollno);
	}
}

