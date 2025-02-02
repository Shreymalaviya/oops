package userdefinedexception;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		try {
			if(age<18) {
				throw new AgeValidatorException();
			}
			else {
				this.age = age;
			}
		}
		catch(AgeValidatorException e){
			System.out.println(e);
		}
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
