import java.util.Scanner;

public class Practice40 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ X��ǥ�� �Է��ϼ���: ");
		int x = input.nextInt();
		System.out.print("������ Y��ǥ�� �Է��ϼ���: ");
		int y = input.nextInt();
		
		Shape s = new Shape(x, y);
		Rectangle r = new Rectangle();
		
		System.out.print("\n�簢���� X��ǥ�� �Է��ϼ���: ");
		r.setX(input.nextInt());
		System.out.print("�簢���� Y��ǥ�� �Է��ϼ���: ");
		r.setY(input.nextInt());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		r.setLength(input.nextInt());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		r.setWidth(input.nextInt());
		
		Triangle t = new Triangle();
		
		System.out.print("\n�ﰢ���� X��ǥ�� �Է��ϼ���: ");
		t.setX(input.nextInt());
		System.out.print("�ﰢ���� Y��ǥ�� �Է��ϼ���: ");
		t.setY(input.nextInt());
		System.out.print("�ﰢ���� �غ��� �Է��ϼ���: ");
		t.setBase(input.nextInt());
		System.out.print("�ﰢ���� ���̸� �Է��ϼ���: ");
		t.setHeight(input.nextInt());
		
		System.out.println("\n�Էµ� ������ �����Դϴ�");
		System.out.println(s);
		
		System.out.println("\n�Էµ� �簢���� �����Դϴ�");
		System.out.println(r);
		
		System.out.println("\n�Էµ� �ﰢ���� �����Դϴ�");
		System.out.println(t);
	}

}
