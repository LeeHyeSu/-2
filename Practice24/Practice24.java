import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Square s1 = new Square();
		Square s2 = new Square();
		
		System.out.print("사각형1의 가로를 입력: ");
		s1.setWidth(s.nextInt());
		System.out.print("사각형1의 세로를 입력: ");
		s1.setHeight(s.nextInt());
		System.out.print("사각형2의 가로를 입력: ");
		s2.setWidth(s.nextInt());
		System.out.print("사각형2의 세로를 입력: ");
		s2.setHeight(s.nextInt());
		
		boolean rslt = s1.isSmallerThan(s2);
		if (rslt == true) {
			System.out.println("사각형1의 넓이가 더 작습니다.");
		}
		else {
			System.out.println("사각형2의 넓이가 더 작습니다.");
		}
	}

}
