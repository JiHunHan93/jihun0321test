package jihunwan0321.com.greedy.jihun.run;

public class jihunDTO {

	private String name;
	private int age;
	private String address;
	private String sex;
	private String sexCity;
	/* 난장판 */
	
	public jihunDTO() {}

	public jihunDTO(String name, int age, String address, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.sex = sex;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "jihunDTO [name=" + name + ", age=" + age + ", address=" + address + ", sex=" + sex + "]";
	}

	
	
}
