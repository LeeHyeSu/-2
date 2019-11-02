import java.util.Scanner;

public class Practice48 {

	public static void main(String[] args) {
		Shape[] sArray = init();
		drawAll(sArray);
	}

	public static Shape[] init() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�Է��� ������ ����: ");
		int num = input.nextInt();
		System.out.println();
		
		Shape[] arr = new Shape[num];   
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "�� ������ ���� (1-�簢��, 2-�ﰢ��, 3-��): ");
			int type = input.nextInt();
		
			System.out.print("�߽� X��ǥ��: ");
			int x = input.nextInt();
			System.out.print("�߽� Y��ǥ��: ");
			int y = input.nextInt();
		
			if (type == 1) {
				Rectangle r = new Rectangle();
				r.setX(x);
				r.setY(y);
			
				System.out.print("�غ��� ���̴�: ");
				r.setWidth(input.nextInt());
				System.out.print("������ ���̴�: ");
				r.setLength(input.nextInt());
				
				arr[i] = r;
			}
			else if (type == 2) {
				Triangle t = new Triangle();
				t.setX(x);
				t.setY(y);
			
				System.out.print("������ ���̴�: ");
				t.setBase(input.nextInt());
				System.out.print("������ ���̴�: ");
				t.setHeight(input.nextInt());
			
				arr[i] = t;
			}
			else {
				Circle c = new Circle();
				c.setX(x);
				c.setY(y);
			
				System.out.print("�������� ���̴�: ");
				c.setRadius(input.nextInt());
				
				arr[i] = c;
			}
		}
		
		return arr;
	}
	
	public static void drawAll(Shape[] sArray) {
		System.out.println("\n�Էµ� �������� �����Դϴ�.");
		for(int i = 0; i < sArray.length; i++) {
			System.out.print((i + 1) + ": ");
			sArray[i].draw();
		}
	}
}
