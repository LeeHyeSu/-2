import java.util.*;

public class Practice68 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("원하는 난수의 개수를 입력하세요: ");
		int n = input.nextInt();
		System.out.print("난수값의 범위를 설정하세요: ");
		int rage = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			list.add(r.nextInt(rage + 1));
		}
		
		System.out.println("생성된 난수는 다음과 같습니다.");
		for(int i = 1; i <= n; i++) {
			System.out.print(list.get(i-1) + "\t");
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		
		Collections.sort(list);
		
		System.out.println("\n정렬된 난수는 다음과 같습니다.");
		for(int i = 1; i <= n; i++) {
			System.out.print(list.get(i-1) + "\t");
			if(i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
