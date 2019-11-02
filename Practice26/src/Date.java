
public class Date {
	private Integer year;
	private Integer month;
	private Integer day;
	
	public void setYear(Integer year) {
		this.year = new Integer(year);
	}
	
	public Integer getYear() {
		return year;
	}
	
	public void setMonth(Integer month) {
		this.month = new Integer(month);
	}
	
	public Integer getMonth() {
		return month;
	}
	
	public void setDay(Integer day) {
		this.day = new Integer(day);
	}
	
	public Integer getDay() {
		return day;
	}
	
	public Date(Integer year, Integer month, Integer day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public Date(Integer year, Integer month) {
		this(year, month, 1);
	}
	
	public Date(Integer year) {
		this(year, 1, 1);
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
