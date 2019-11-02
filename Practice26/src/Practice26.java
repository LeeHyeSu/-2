
public class Practice26 {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(2016);
		Date d3 = new Date(2017, 2);
		Date d4 = new Date(2017, 3, 2);
		Date d5 = new Date(2017, 4);
		Date d6 = new Date(2017, 4, 26);
		
		d1.setYear(2017);
		d1.setMonth(2);
		d1.setDay(18);
		
		String str1 = d1.toString();
		System.out.println("오늘은 " + str1 + "입니다.");
		
		d2.setMonth(3);
		d2.setDay(2);
		
		String str2 = d2.toString();
		System.out.println("내가 동덕여자대학교에 입학한 날짜는 " + str2 + "입니다.");
		
		d3.setDay(27);
		
		String str3 = d3.toString();
		String str4 = d4.toString();
		System.out.println("2017학년도 개강일은 " + str3 + "에서 " + str4 + "로 변경되었습니다.");
		
		d5.setDay(20);
		
		String str5 = d5.toString();
		String str6 = d6.toString();
		System.out.println("중간고사 기간은 " + str5 + "부터 " + str6 + "까지 입니다.");
	}

}
