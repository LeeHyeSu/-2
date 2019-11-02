import java.util.Scanner;

public class Practice23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BodyData b1 = new BodyData();
		BodyData b2 = new BodyData();
		
		System.out.print("내 키를 입력하세요: ");
		b1.setHeight(s.nextInt());
		System.out.print("내 몸무게를 입력하세요: ");
		b1.setWeight(s.nextInt());
		System.out.print("당신의 키를 입력하세요: ");
		b2.setHeight(s.nextInt());
		System.out.print("당신의 몸무게를 입력하세요: ");
		b2.setWeight(s.nextInt());
		
		boolean rslt = b1.isTallerThan(b2);
		if (rslt == true) {
			System.out.println("키는 내가 더 큽니다.");
		}
		else {
			System.out.println("키는 당신이 더 큽니다.");
		}
		
		rslt = b1.needDiet();
		if (rslt == false) {
			System.out.println("나는 다이어트가 필요하지 않습니다.");
		}
		else {
			System.out.println("나는 다이어트가 필요합니다.");
		}
		
		rslt = b2.needDiet();
		if (rslt == false) {
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
		}
		else {
			System.out.println("당신은 다이어트가 필요합니다.");
		}
	}

}
