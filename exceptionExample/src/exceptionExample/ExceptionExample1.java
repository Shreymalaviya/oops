package exceptionExample;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		try {
			int[] arr = {7,8,9,2};
//			a=4;
//			b=0;
//			c=a/b;
//			System.out.println(c);
			System.out.println(arr[7]);
			}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ar) {
			System.out.println(ar.getMessage());
		}
//		catch(ArrayIndexOutOfBoundsException arr1) {
//			System.out.println(arr1.getMessage());
//		}
//		catch(Exception e1) {//main catch should be at last.
//			System.out.println(e1.getMessage());
//		}
	}

}
