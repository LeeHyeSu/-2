
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
		System.out.println("������ " + str1 + "�Դϴ�.");
		
		d2.setMonth(3);
		d2.setDay(2);
		
		String str2 = d2.toString();
		System.out.println("���� �������ڴ��б��� ������ ��¥�� " + str2 + "�Դϴ�.");
		
		d3.setDay(27);
		
		String str3 = d3.toString();
		String str4 = d4.toString();
		System.out.println("2017�г⵵ �������� " + str3 + "���� " + str4 + "�� ����Ǿ����ϴ�.");
		
		d5.setDay(20);
		
		String str5 = d5.toString();
		String str6 = d6.toString();
		System.out.println("�߰���� �Ⱓ�� " + str5 + "���� " + str6 + "���� �Դϴ�.");
	}

}
