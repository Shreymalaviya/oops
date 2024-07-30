package relationshipsExample;

public class Person {
	private String pname,pemail;
	private Adress adr;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public Adress getAdr() {
		return adr;
	}
	public void setAdr(Adress adr) {
		this.adr = adr;
	}
	
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pemail=" + pemail + ", adr=" + adr + "]";
	}
}
