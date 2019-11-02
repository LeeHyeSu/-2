import java.util.Scanner;

public class Practice47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Shape[] sArray = new Shape[3];
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		System.out.print("도형의 X좌표를 입력하세요: ");
		s.setX(input.nextInt());
		System.out.print("도형의 Y좌표를 입력하세요: ");
		s.setY(input.nextInt());
		
		System.out.print("\n사각형의 X좌표를 입력하세요: ");
		r.setX(input.nextInt());
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		r.setY(input.nextInt());
		System.out.print("사각형의 가로를 입력하세요: ");
		r.setWidth(input.nextInt());
		System.out.print("사각형의 세로를 입력하세요: ");
		r.setLength(input.nextInt());
		
		System.out.print("\n삼각형의 X좌표를 입력하세요: ");
		t.setX(input.nextInt());
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		t.setY(input.nextInt());
		System.out.print("삼각형의 밑변을 입력하세요: ");
		t.setBase(input.nextInt());
		System.out.print("삼각형의 높이를 입력하세요: ");
		t.setHeight(input.nextInt());
		
		sArray[0] = s;
		sArray[1] = r;
		sArray[2] = t;
		
		System.out.println("\n입력된 정보입니다");
		for(int i = 0; i < sArray.length; i++) {
			System.out.print((i + 1) + ": ");
			sArray[i].draw();
		}
		
		System.out.println("\n-- 이동 후 --");
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].move();
			System.out.print((i + 1) + ": ");
			sArray[i].draw();
		}
	}

}
