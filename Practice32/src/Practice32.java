import java.util.Random;

public class Practice32 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[5];
		int cnt = 1;
		boolean rslt = false;
		
		do {
			for(int i = 0; i < arr.length; i++) {
				arr[i] = r.nextInt(101);
			}
			
			System.out.println("(" + cnt + "차 실행)");
			
			for(int value : arr) {
				System.out.print(value + "\t");
				if(value == 100) {
					rslt = true;
				}
			}
			System.out.println();
			
			cnt++;
		} while(rslt == false);
		
		System.out.println(cnt + "차 실행에서 난수 100이 발생했으므로 프로그램을 종료합니다.");
	}

}
