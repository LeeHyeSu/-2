
public class Movie {
	private String title;
	private String director;
	private Date viewDay;
	
	public void setTitle(String t) {
		title = t;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setDirector(String d) {
		director = d;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setViewDay(Date d) {
		viewDay = d;
	}
	
	public Date getViewDay() {
		return viewDay;
	}
	
	public Movie() {
		title = "��";
		director = "��";
		viewDay = new Date(1999, 9, 9);
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += "����: " + title + "\n";
		rslt += "����: " + director + "\n";
		rslt += "������: " + viewDay.toString();
		
		return rslt;
	}
}
