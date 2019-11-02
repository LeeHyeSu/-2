
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
		
		rslt += "중심좌표: (" + x + ", " + y + ")";
		
		return rslt;
	}
	
	public void draw() {
		System.out.println("도형, " + this.toString());
	}
}
