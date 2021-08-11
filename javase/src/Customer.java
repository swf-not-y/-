
public class Customer {
	private int age;
	private String name;
	private String birth; a
	public Customer(int age) {
		super();
		this.age = age;
	}
	public Customer() {
		super();
	}
	public Customer(int age, String name, String birth) {
		super();
		this.age = age;
		this.name = name;
		this.birth = birth;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
