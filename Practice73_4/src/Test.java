
public class Test {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Job());
		Thread t2 = new Thread(new Job());
		t1.start();
		t2.start();
	}

}
