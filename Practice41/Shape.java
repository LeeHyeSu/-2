
public abstract class Shape {
	private int x;
	private int y;
	
	protected void setX(int x) {
		this.x = x;
	}
	
	protected int getX() {
		return x;
	}
	
	protected void setY(int y) {
		this.y = y;
	}
	
	protected int getY() {
		return y;
	}
	
	protected Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	protected Shape() {
		this(0, 0);
	}
	
	public abstract double calcArea();
	
	public String toString() {
		String rslt = "";
		
		rslt += "Áß½ÉÁÂÇ¥: (" + x + ", " + y + ")";
		
		return rslt;
	}
}
