
public class Practice46A {

	public static void main(String[] args) {
		Student[] sArray = new Student[3];
		sArray[0] = new Student(1111, 100, 3.2);
		sArray[1] = new UndergraduateStudent(2222, 100, 4.1, 3);
		sArray[2] = new GraduateStudent(3333, 100, 3.4, "SE");
		
		printAll(sArray);
	}
	
	public static void printAll(Student[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString());
		}
	}

}
