import java.util.Scanner;

public class Practice28 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Circle c1 = new Circle();
		
		System.out.println("ù��° �� c1�� �����Դϴ�.");
		String str1 = c1.toString();
		System.out.println(str1);
		
		Point p2 = new Point(0, 0);
		Circle c2 = new Circle(p2, 0);
		
		System.out.println("\n�ι�° �� c2�� ������ �Է� �޽��ϴ�.");
		System.out.print("�߽���ǥ�� X���� �Է��ϼ���: ");
		p2.setX(s.nextInt());
		System.out.print("�߽���ǥ�� Y���� �Է��ϼ���: ");
		p2.setY(s.nextInt());
		System.out.print("������ ���� �Է��ϼ���: ");
		c2.setRadius(s.nextInt());
		
		System.out.println("\n�ι�° �� c2�� �����Դϴ�.");
		String str2 = c2.toString();
		System.out.println(str2);
		
		Point p3 = new Point(0, 0);
		Circle c3 = new Circle();
		
		System.out.println("\n����° �� c3�� ������ �Է� �޽��ϴ�.");
		System.out.print("�߽���ǥ�� X���� �Է��ϼ���: ");
		p3.setX(s.nextInt());
		System.out.print("�߽���ǥ�� Y���� �Է��ϼ���: ");
		p3.setY(s.nextInt());
		System.out.print("������ ���� �Է��ϼ���: ");
		c3.setRadius(s.nextInt());
		c3.setCenter(p3);
		
		System.out.println("\n����° �� c3�� �����Դϴ�.");
		String str3 = c3.toString();
		System.out.println(str3);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
