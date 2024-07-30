package q1;

public class MyClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myObject1 = new MyClass(5);
        MyClass myObject2 = new MyClass(7);
        MyClass m = new MyClass(2);
        
        myObject1.printX();
        myObject1.incrementCount();
        m.incrementCount();
        myObject1.printCount();
        myObject2.printCount();
        myObject2.printX();
        myObject1.setX(14);
        myObject1.incrementCount();
        myObject1.printX();
        myObject1.printCount();
        myObject2.printCount();
	}

}
