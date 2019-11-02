
public class Practice22 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 20111234, "컴퓨터학");
		Student s2 = new Student("성춘향", 20121357);
		s2.setMajor("국문학");
		
		String str1 = s1.toString();
		String str2 = s2.toString();
		
		System.out.println(str1);
		System.out.println();
		System.out.println(str2);
	}

}
