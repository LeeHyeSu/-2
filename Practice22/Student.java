
public class Student extends Person {
	private long sid;
	private String major;
	
	public void setSid(long sid) {
		this.sid = sid;
	}
	
	public long getSid() {
		return sid;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public Student(String name, long id, String major) {
		super(name, -1, "모름");
		setSid(id);
		setMajor(major);
	}
	
	public Student(String name, long id) {
		super(name, -1);
		setSid(id);
		setMajor("모름");
	}
	
	public Student(String name) {
		super(name);
		setSid(-1);
		setMajor("모름");
	}
	
	public Student() {
		super();
		setSid(-1);
		setMajor("모름");
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += "이름: " + getName() + "\n";
		rslt += "학번: " + getSid() + "\n";
		rslt += "전공: " + getMajor();
		
		return rslt;
	}
}
