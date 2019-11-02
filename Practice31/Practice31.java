import java.util.Random;

public class Practice31 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10];
		int i;
		int total = 0;
		int average = 0;
		
		for(i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(101);
		}
		
		for(int value : arr) {
			System.out.print(value + "\t");
		}
		System.out.println();
		
		for(i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		for(int number : arr) {
			total += number;
		}
		average = total / arr.length;
		
		System.out.println("난수들의 총합: " + total);
		System.out.println("난수들의 평균: " + average);
	}

}