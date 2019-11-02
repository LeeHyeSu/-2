
public class Job implements Runnable {
	String name;
	
	public Job(String name) {
		this.name = name;
	}
	
	public void run() {
		byte n = 0;
		while (true) 
			System.out.println(name + n++);
	}
	
}
