import java.util.Scanner;

public class Practice27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pair p1 = new Pair(0, 0);
		Pair p2 = new Pair(0, 0);
		
		System.out.print("1��° ������ x��ǥ: ");
		p1.setX(s.nextInt());
		System.out.print("1��° ������ y��ǥ: ");
		p1.setY(s.nextInt());
		System.out.print("2��° ������ x��ǥ: ");
		p2.setX(s.nextInt());
		System.out.print("2��° ������ y��ǥ: ");
		p2.setY(s.nextInt());
		
		String str = p1.toString(p1, p2);
		System.out.println(str);
	}

}
