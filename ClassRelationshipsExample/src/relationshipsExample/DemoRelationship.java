package relationshipsExample;

public class DemoRelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adress adr = new Adress();
		adr.setFlatno("B-504");
		adr.setSocietname("Applewood Sorrel");
		adr.setArea("Shela");
		adr.setPincode(380058);
		
		Person p = new Person();
		p.setPname("Shrey");
		p.setPemail("shrey@gmail.com");
		p.setAdr(adr);
		
		System.out.println(p);
	}

}
