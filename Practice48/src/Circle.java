
public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle() {
		radius = 0;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double calcArea() {
		double rslt;
		
		rslt = radius * radius * 3.14;
		
		return rslt;
	}
	
	public String toString() {
		String rslt = super.toString();
		
		rslt += ", ������: " + radius;
		rslt += ", ����: " + this.calcArea();
		
		return rslt;
	}
	
	public void draw() {
		System.out.println("��, " + this.toString());
	}
}
