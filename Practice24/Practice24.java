import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Square s1 = new Square();
		Square s2 = new Square();
		
		System.out.print("�簢��1�� ���θ� �Է�: ");
		s1.setWidth(s.nextInt());
		System.out.print("�簢��1�� ���θ� �Է�: ");
		s1.setHeight(s.nextInt());
		System.out.print("�簢��2�� ���θ� �Է�: ");
		s2.setWidth(s.nextInt());
		System.out.print("�簢��2�� ���θ� �Է�: ");
		s2.setHeight(s.nextInt());
		
		boolean rslt = s1.isSmallerThan(s2);
		if (rslt == true) {
			System.out.println("�簢��1�� ���̰� �� �۽��ϴ�.");
		}
		else {
			System.out.println("�簢��2�� ���̰� �� �۽��ϴ�.");
		}
	}

}
