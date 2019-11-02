import java.util.*;

public class Practice68 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("���ϴ� ������ ������ �Է��ϼ���: ");
		int n = input.nextInt();
		System.out.print("�������� ������ �����ϼ���: ");
		int rage = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			list.add(r.nextInt(rage + 1));
		}
		
		System.out.println("������ ������ ������ �����ϴ�.");
		for(int i = 1; i <= n; i++) {
			System.out.print(list.get(i-1) + "\t");
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		
		Collections.sort(list);
		
		System.out.println("\n���ĵ� ������ ������ �����ϴ�.");
		for(int i = 1; i <= n; i++) {
			System.out.print(list.get(i-1) + "\t");
			if(i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
