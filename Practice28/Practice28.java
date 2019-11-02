import java.util.Scanner;

public class Practice28 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Circle c1 = new Circle();
		
		System.out.println("첫번째 원 c1의 정보입니다.");
		String str1 = c1.toString();
		System.out.println(str1);
		
		Point p2 = new Point(0, 0);
		Circle c2 = new Circle(p2, 0);
		
		System.out.println("\n두번째 원 c2의 정보를 입력 받습니다.");
		System.out.print("중심좌표의 X값을 입력하세요: ");
		p2.setX(s.nextInt());
		System.out.print("중심좌표의 Y값을 입력하세요: ");
		p2.setY(s.nextInt());
		System.out.print("반지름 값을 입력하세요: ");
		c2.setRadius(s.nextInt());
		
		System.out.println("\n두번째 원 c2의 정보입니다.");
		String str2 = c2.toString();
		System.out.println(str2);
		
		Point p3 = new Point(0, 0);
		Circle c3 = new Circle();
		
		System.out.println("\n세번째 원 c3의 정보를 입력 받습니다.");
		System.out.print("중심좌표의 X값을 입력하세요: ");
		p3.setX(s.nextInt());
		System.out.print("중심좌표의 Y값을 입력하세요: ");
		p3.setY(s.nextInt());
		System.out.print("반지름 값을 입력하세요: ");
		c3.setRadius(s.nextInt());
		c3.setCenter(p3);
		
		System.out.println("\n세번째 원 c3의 정보입니다.");
		String str3 = c3.toString();
		System.out.println(str3);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
