import java.util.Scanner;

public class Practice23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BodyData b1 = new BodyData();
		BodyData b2 = new BodyData();
		
		System.out.print("�� Ű�� �Է��ϼ���: ");
		b1.setHeight(s.nextInt());
		System.out.print("�� �����Ը� �Է��ϼ���: ");
		b1.setWeight(s.nextInt());
		System.out.print("����� Ű�� �Է��ϼ���: ");
		b2.setHeight(s.nextInt());
		System.out.print("����� �����Ը� �Է��ϼ���: ");
		b2.setWeight(s.nextInt());
		
		boolean rslt = b1.isTallerThan(b2);
		if (rslt == true) {
			System.out.println("Ű�� ���� �� Ů�ϴ�.");
		}
		else {
			System.out.println("Ű�� ����� �� Ů�ϴ�.");
		}
		
		rslt = b1.needDiet();
		if (rslt == false) {
			System.out.println("���� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
		}
		else {
			System.out.println("���� ���̾�Ʈ�� �ʿ��մϴ�.");
		}
		
		rslt = b2.needDiet();
		if (rslt == false) {
			System.out.println("����� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
		}
		else {
			System.out.println("����� ���̾�Ʈ�� �ʿ��մϴ�.");
		}
	}

}
