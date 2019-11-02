import java.util.Scanner;

public class Practice40 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("도형의 X좌표를 입력하세요: ");
		int x = input.nextInt();
		System.out.print("도형의 Y좌표를 입력하세요: ");
		int y = input.nextInt();
		
		Shape s = new Shape(x, y);
		Rectangle r = new Rectangle();
		
		System.out.print("\n사각형의 X좌표를 입력하세요: ");
		r.setX(input.nextInt());
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		r.setY(input.nextInt());
		System.out.print("사각형의 가로를 입력하세요: ");
		r.setLength(input.nextInt());
		System.out.print("사각형의 세로를 입력하세요: ");
		r.setWidth(input.nextInt());
		
		Triangle t = new Triangle();
		
		System.out.print("\n삼각형의 X좌표를 입력하세요: ");
		t.setX(input.nextInt());
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		t.setY(input.nextInt());
		System.out.print("삼각형의 밑변을 입력하세요: ");
		t.setBase(input.nextInt());
		System.out.print("삼각형의 높이를 입력하세요: ");
		t.setHeight(input.nextInt());
		
		System.out.println("\n입력된 도형의 정보입니다");
		System.out.println(s);
		
		System.out.println("\n입력된 사각형의 정보입니다");
		System.out.println(r);
		
		System.out.println("\n입력된 삼각형의 정보입니다");
		System.out.println(t);
	}

}
