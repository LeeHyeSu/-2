
public class Person {
	private String name;
	private int age;
	private String address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Person(String name, int age, String address) {
		setName(name);
		setAge(age);
		setAddress(address);
	}
	
	public Person(String name, int age) {
		this(name, age, "��");
	}
	
	public Person(String name) {
		this(name, -1, "��");
	}
	
	public Person() {
		this("��", -1, "��");
		
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += "�̸�: " + name + "\n";
		rslt += "����: " + age + "\n";
		rslt += "�ּ�: " + address;
		
		return rslt;
	}
}
