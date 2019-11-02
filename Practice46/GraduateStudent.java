
public class GraduateStudent extends Student {
	private String lab;
	
	public GraduateStudent(int id, int tuition, double gpa, String lab) {
		super(id, tuition, gpa);
		this.lab = lab;
	}
	
	public String getLab() {
		return lab;
	}
	
	public void setLab(String lab) {
		this.lab = lab;
	}
	
	public String toString() {
		return super.toString() + ", ¿¬±¸½Ç: " + lab;
	}
	
	public int scholarship() {
		int rslt;
		
		if(getGpa() >= 3.5) {
			rslt = (int)(getTuition() * 0.5);
		}
		else {
			rslt = (int)(getTuition() * 0.1);
		}
		
		return rslt;
	}
}
