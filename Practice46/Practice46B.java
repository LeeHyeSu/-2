
public class Practice46B {

	public static void main(String[] args) {
		Student s1 = new Student(1111, 100, 3.2);
		UndergraduateStudent s2 = new UndergraduateStudent(2222, 100, 4.1, 3);
		GraduateStudent s3 = new GraduateStudent(3333, 100, 3.4, "SE");
		Student[] sArray = new Student[3];
		
		sArray[0] = s1;
		sArray[1] = s2;
		sArray[2] = s3;
		
		printAll(sArray);
	}
	
	public static void printAll(Student[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString());
		}
	}

}
