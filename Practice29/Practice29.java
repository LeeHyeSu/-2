import java.util.Scanner;

public class Practice29 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Movie m0 = new Movie();
		
		System.out.println("디폴트 영화의 정보입니다.");
		String str0 = m0.toString();
		System.out.println(str0);
		
		Movie m1 = new Movie();
		Date dTmp = m1.getViewDay();
		
		System.out.println("\n영화정보를 입력하세요.");
		System.out.print("영화제목은? ");
		m1.setTitle(s.next());
		System.out.print("감독은? ");
		m1.setDirector(s.next());
		System.out.print("관람년도는? ");
		dTmp.setYear(s.nextInt());
		System.out.print("관람 월은? ");
		dTmp.setMonth(s.nextInt());
		System.out.print("관람 일은? ");
		dTmp.setDay(s.nextInt());
		
		System.out.println("\n입력한 영화의 정보입니다.");
		String str1 = m1.toString();
		System.out.println(str1);

	}

}
