package constructorExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestAdress {

	public static void main(String[] args) {
		
		Adress ad = new Adress();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the society name : ");
		try {
			String name = bf.readLine();
			ad.setSocietyName(name);
			int pin = Integer.parseInt(bf.readLine());
			ad.setPincode(pin);
			System.out.println(ad);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Adress ad2 = new Adress("Priyank","mota varachha",394101);
		System.out.println(ad2);
	}
	
}