
public class UndergraduateStudent extends Student {
	private int year;
	
	public UndergraduateStudent(int id, int tuition, double gpa, int year) {
		super(id, tuition, gpa);
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return super.toString() + ", ÇĞ³â: " + year;
	}
	
	public int scholarship() {
		return (int)(getTuition() * 0.3);
	}
}
