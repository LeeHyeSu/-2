import java.util.Scanner;

public class Practice29 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Movie m0 = new Movie();
		
		System.out.println("����Ʈ ��ȭ�� �����Դϴ�.");
		String str0 = m0.toString();
		System.out.println(str0);
		
		Movie m1 = new Movie();
		Date dTmp = m1.getViewDay();
		
		System.out.println("\n��ȭ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		m1.setTitle(s.next());
		System.out.print("������? ");
		m1.setDirector(s.next());
		System.out.print("�����⵵��? ");
		dTmp.setYear(s.nextInt());
		System.out.print("���� ����? ");
		dTmp.setMonth(s.nextInt());
		System.out.print("���� ����? ");
		dTmp.setDay(s.nextInt());
		
		System.out.println("\n�Է��� ��ȭ�� �����Դϴ�.");
		String str1 = m1.toString();
		System.out.println(str1);

	}

}
