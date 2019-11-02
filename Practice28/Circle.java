
public class Circle {
	private int radius = 0;
	private Point center;
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	
	public Circle() {
		center = new Point(0, 0);
		radius = 0;
	}
	
	public void setRadius(int r) {
		radius = r;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setCenter(Point p) {
		center = p;
	}
	
	public Point getCenter() {
		return center;
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += center.toString();
		rslt += "¹İÁö¸§ : " + radius;
		
		return rslt;
	}
}
