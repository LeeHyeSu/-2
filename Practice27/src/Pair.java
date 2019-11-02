
public class Pair {
	Integer x;
	Integer y;
	
	public void setX(Integer x) {
		this.x = x;
	}
	
	public Integer getX() {
		return x;
	}
	
	public void setY(Integer y) { 
		this.y = y;
	}
	
	public Integer getY() {
		return y;
	}
	
	public Pair(Integer x, Integer y) {
		this.x = new Integer(x);
		this.y = new Integer(y);
	}
	
	public static Pair add(Pair a, Pair b) {
		int add_x = a.x + b.x;
		int add_y = a.y + b.y;
		
		Pair rslt = new Pair(add_x, add_y);
		
		return rslt;
	}
	
	public static Pair sub(Pair a, Pair b) {
		int sub_x = a.x - b.x;
		int sub_y = a.y - b.y;
		
		Pair rslt = new Pair(sub_x, sub_y);
		
		return rslt;
	}
	
	public static Pair mult(Pair a, Pair b) {
		int mult_x = a.x * b.x;
		int mult_y = a.y * b.y;
		
		Pair rslt = new Pair(mult_x, mult_y);
		
		return rslt;
	}
	
	public static Pair div(Pair a, Pair b) {
		int div_x = a.x / b.x;
		int div_y = a.y / b.y;
		
		Pair rslt = new Pair(div_x, div_y);
		
		return rslt;
	}
	
	public String toString(Pair a, Pair b) {
		String rslt = "";
		
		rslt += "ÀÔ·ÂµÈ 1¹ø ¼ø¼­½Ö: (" + a.x + ", " + a.y + ")\n";
		rslt += "ÀÔ·ÂµÈ 2¹ø ¼ø¼­½Ö: (" + b.x + ", " + b.y + ")\n";
		rslt += "µ¡¼À °á°ú : (" + add(a, b).x + ", " + add(a, b).y + ")\n";
		rslt += "»¬¼À °á°ú : (" + sub(a, b).x + ", " + sub(a, b).y + ")\n";
		rslt += "°ö¼À °á°ú : (" + mult(a, b).x + ", " + mult(a, b).y + ")\n";
		rslt += "³ª´°¼À °á°ú : (" + div(a, b).x + ", " + div(a, b).y + ")\n";
		
		return rslt;
	}
}
