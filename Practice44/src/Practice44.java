
public class Practice44 {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		Person p1 = new Person("�赿��", 1);
		Person p2 = new Person("ȫ�浿", 20);
		
		speak3Times(myDog);
		speak3Times(p1);
		speak3Times(p2);
	}
	
	public static void speak3Times(Dog d) {
		for(int i = 0; i < 3; i++) {
			d.speak();
		}
	}
	
	public static void speak3Times(Person p) {
		for(int i = 0; i < 3; i++) {
			p.speak();
		}
	}

}
