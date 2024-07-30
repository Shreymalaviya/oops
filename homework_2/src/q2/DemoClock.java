package q2;

public class DemoClock {

	public static void main(String[] args) {
		Clock c1 = new Clock();
		Clock c2 = new Clock(20,1,0);
		Clock c3 = new Clock(4000);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		c2.tick();
		c2.tickDown();
	}

}
