package customexception;
import java.util.*;

public class CustomException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 7;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		try {
			if(age<18) {
				throw new ArithmeticException();
			}
			else {
				System.out.println("You are eligible for voting as your age is " + age);
			}
		}
		catch(ArithmeticException ar){
			System.out.println("you are not eligible");
		}
	}

}
