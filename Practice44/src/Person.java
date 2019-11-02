
public class Person implements Speakable {
	private String name;
	private int age;
	
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
	
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public void speak() {
		if(age >= 2) {
			System.out.println("æ»≥Á");
		}
		else {
			System.out.println("¿¿æ÷");
		}
	}
}
