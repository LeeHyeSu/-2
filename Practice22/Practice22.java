
public class Practice22 {

	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 20111234, "��ǻ����");
		Student s2 = new Student("������", 20121357);
		s2.setMajor("������");
		
		String str1 = s1.toString();
		String str2 = s2.toString();
		
		System.out.println(str1);
		System.out.println();
		System.out.println(str2);
	}

}
