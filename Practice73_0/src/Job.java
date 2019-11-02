
public class Job implements Runnable {

	public void run() {
		byte n = 0;
		while (true) 
			System.out.println(n++);
	}

}
