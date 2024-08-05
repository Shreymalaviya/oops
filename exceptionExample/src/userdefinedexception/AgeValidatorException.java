package userdefinedexception;

public class AgeValidatorException extends Exception{
	
	public AgeValidatorException() {
		System.out.println("below 18 is not eligible for voting");
	}
	
	public AgeValidatorException(String msg) {
		System.out.println(msg);
	}
}
