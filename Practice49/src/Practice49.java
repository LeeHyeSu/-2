
public class Practice49 {

	public static void main(String[] args) {
		Triangle[] tArray = new Triangle[3];
		tArray[0] = new Triangle(0, 0, 1, 2);
		tArray[1] = new Triangle(0, 0, 2, 3);
		tArray[2] = new Triangle(0, 0, 3, 4);
		resizeAll(tArray, 2.0);
		drawAll(tArray);
		
		Circle[] cArray = new Circle[4];
		for(int i = 0; i < cArray.length; i++) {
			cArray[i] = new Circle(1, 1, i + 1);
		}
		resizeAll(cArray, 1.5);
		drawAll(cArray);
	}
	
	public static void resizeAll(Triangle[] tarray, double scale) {
		for(int i = 0; i < tarray.length; i++) {
			tarray[i].resize(scale);
		}
	}
	
	public static void resizeAll(Circle[] carray, double scale) {
		for(int i = 0; i < carray.length; i++) {
			carray[i].resize(scale);
		}
	}
	
	public static void drawAll(Shape[] sarray) {
		for(int i = 0; i < sarray.length; i++) {
			sarray[i].draw();
		}
	}

}
