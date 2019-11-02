
public class Point {
	private int x, y;
	
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	
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
	
	public String toString() {
		String rslt = "";
		
		rslt += "Áß½ÉÁÂÇ¥ : (" + x + ", " + y + ")\n";

		return rslt;
	}
}
