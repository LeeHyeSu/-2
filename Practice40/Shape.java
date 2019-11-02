
public class Shape {
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Shape() {
		this(0, 0);
	}
	
	public double calcArea() {
		double area;
		
		area = x * y;
		
		return area;
 	}
	
	public String toString() {
		String rslt = "";
		
		rslt += "Áß½ÉÁÂÇ¥: (" + x + ", " + y + ")";
		
		return rslt;
	}
}
