package jihunwan0321.com.jihunh.section02.model.dto;

public class JihunDTO {
	
	private String name;
	private int age;
	private int address;
	
	public JihunDTO() {}

	public JihunDTO(String name, int age, int address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

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
		this.age = age;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "JihunDTO [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
}
