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
			
			System.out.println("(" + cnt + "�� ����)");
			
			for(int value : arr) {
				System.out.print(value + "\t");
				if(value == 100) {
					rslt = true;
				}
			}
			System.out.println();
			
			cnt++;
		} while(rslt == false);
		
		System.out.println(cnt + "�� ���࿡�� ���� 100�� �߻������Ƿ� ���α׷��� �����մϴ�.");
	}

}
