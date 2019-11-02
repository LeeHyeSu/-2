
public class Job implements Runnable {

	public void run() {
		byte n = 0;
		for (int i = 1; i <= 200; i++) {
			System.out.print(n++);
			if(i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
