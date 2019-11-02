import java.util.Scanner;

public class Practice48 {

	public static void main(String[] args) {
		Shape[] sArray = init();
		drawAll(sArray);
	}

	public static Shape[] init() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("입력할 도형의 개수: ");
		int num = input.nextInt();
		System.out.println();
		
		Shape[] arr = new Shape[num];   
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번 도형의 종류 (1-사각형, 2-삼각형, 3-원): ");
			int type = input.nextInt();
		
			System.out.print("중심 X좌표는: ");
			int x = input.nextInt();
			System.out.print("중심 Y좌표는: ");
			int y = input.nextInt();
		
			if (type == 1) {
				Rectangle r = new Rectangle();
				r.setX(x);
				r.setY(y);
			
				System.out.print("밑변의 길이는: ");
				r.setWidth(input.nextInt());
				System.out.print("높이의 길이는: ");
				r.setLength(input.nextInt());
				
				arr[i] = r;
			}
			else if (type == 2) {
				Triangle t = new Triangle();
				t.setX(x);
				t.setY(y);
			
				System.out.print("가로의 길이는: ");
				t.setBase(input.nextInt());
				System.out.print("세로의 길이는: ");
				t.setHeight(input.nextInt());
			
				arr[i] = t;
			}
			else {
				Circle c = new Circle();
				c.setX(x);
				c.setY(y);
			
				System.out.print("반지름의 길이는: ");
				c.setRadius(input.nextInt());
				
				arr[i] = c;
			}
		}
		
		return arr;
	}
	
	public static void drawAll(Shape[] sArray) {
		System.out.println("\n입력된 도형들의 정보입니다.");
		for(int i = 0; i < sArray.length; i++) {
			System.out.print((i + 1) + ": ");
			sArray[i].draw();
		}
	}
}
