
public class Triangle extends Shape implements Resizable {
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
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	
	public Triangle(int base) {
		this(0, 0, base, 0);
	}
	
	public Triangle() {
		this(0, 0, 0, 0);
	}
	
	public double calcArea() {
		double area;
		
		area = base * height;
		
		return area;
	}
	
	public String toString() {
		String rslt = super.toString();
		
		rslt += ", ¹Øº¯: " + base + ", ³ôÀÌ: " + height + ", ¸éÀû: " + this.calcArea();
		
		return rslt;
	}
	
	public void draw() {
		System.out.println("»ï°¢Çü, " + this.toString());
	}
	
	public void resize(double scale) {
		base = (int)(base * scale);
		height = (int)(height * scale);
	}

}