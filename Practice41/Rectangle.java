
public class Rectangle extends Shape {
	private int length;
	private int width;
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle(int length) {
		this(length, 0);
	}
	
	public Rectangle() {
		this(0, 0);
	}
	
	public double calcArea() {
		double area;
		
		area = length * width;
		
		return area;
	}
	
	public String toString() {
		String rslt = super.toString();
		
		rslt += ", 가로: " + length + ", 세로: " + width;
		rslt += ", 면적: " + this.calcArea();
		
		return rslt;
	}
}
