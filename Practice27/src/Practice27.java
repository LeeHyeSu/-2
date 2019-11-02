import java.util.Scanner;

public class Practice27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pair p1 = new Pair(0, 0);
		Pair p2 = new Pair(0, 0);
		
		System.out.print("1¹øÂ° ¼ø¼­½Ö xÁÂÇ¥: ");
		p1.setX(s.nextInt());
		System.out.print("1¹øÂ° ¼ø¼­½Ö yÁÂÇ¥: ");
		p1.setY(s.nextInt());
		System.out.print("2¹øÂ° ¼ø¼­½Ö xÁÂÇ¥: ");
		p2.setX(s.nextInt());
		System.out.print("2¹øÂ° ¼ø¼­½Ö yÁÂÇ¥: ");
		p2.setY(s.nextInt());
		
		String str = p1.toString(p1, p2);
		System.out.println(str);
	}

}
