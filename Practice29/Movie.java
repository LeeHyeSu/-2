
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
		title = "모름";
		director = "모름";
		viewDay = new Date(1999, 9, 9);
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += "제목: " + title + "\n";
		rslt += "감독: " + director + "\n";
		rslt += "관람일: " + viewDay.toString();
		
		return rslt;
	}
}
