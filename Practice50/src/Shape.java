import java.util.Random;

public class Shape implements Movable, Drawable {
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
		
	public void move() {
		Random r = new Random();
		
		x = r.nextInt(100);
		y = r.nextInt(100);	
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