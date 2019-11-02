
public class Square {
	private int width;
	private int height;
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int area() {
		int rslt;
		
		rslt = width * height;
		
		return rslt;
	}
	
	public boolean isSmallerThan(Square s) {
		boolean rslt;
		
		if (this.area() < s.area()) {
			rslt = true;
		}
		else {
			rslt = false;
		}
		
		return rslt;
	}
}
