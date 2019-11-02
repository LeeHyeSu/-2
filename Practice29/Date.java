
public class Date {
	private int year;
	private int month;
	private int day;
	
	public void setYear(int y) {
		year = y;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMonth(int m) {
		month = m;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int d) {
		day = d;
	}
	
	public int getDay() {
		return day;
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public Date(int year, int month) {
		this.year = year;
		this.month = month;
		day = 1;
	}
	
	public Date(int year) {
		this.year = year;
		month = 1;
		day = 1;
	}
	
	public Date() {
		this(1990, 1, 1);
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += getYear() + "³â ";
		rslt += getMonth() + "¿ù ";
		rslt += getDay() + "ÀÏ";
		
		return rslt;
	}
}
