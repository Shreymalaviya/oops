package firstproject;

class FirstClass {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.getdata();
		s1.display();
		
		
		Student2 s2 = new Student2();
		s2.setName("Shrey");
		s2.setRollno(27);
		
		System.out.println(s2.getName());
		System.out.println(s2.getRollno());
		
		
		Employee e1 = new Employee();
		e1.setName("Shreyansh");
		e1.setEmail("malaviyashrey@gmail.com");
		e1.setCompanyname("Crest");
		e1.setDesignation("project manager");
		e1.setSalary(50000);
		
		System.out.println(e1);
		
		
		Carrental c = new Carrental();
		c.GetCar();
		c.GetRent();
		c.ShowCar();
		}
	}
