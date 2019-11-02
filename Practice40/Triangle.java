
public class Triangle extends Shape {
	private int base;
	private int height;
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public Triangle(int base) {
		this(base, 0);
	}
	
	public Triangle() {
		this(0, 0);
	}
	
	public double calcArea() {
		double area;
		
		area = base * height;
		
		return area;
	}
	
	public String toString() {
		String rslt = super.toString();
		
		rslt += ", 밑변: " + base + ", 높이: " + height;
		rslt += ", 면적: " + this.calcArea();
		
		return rslt;
	}
}
