import java.util.Random;

public class Practice50 {
	
	public static void main(String[] args) {
		Shape s = new Shape(0, 0);
		/*문제는 매개변수가 4개인 생성자를 사용하여 Shape객체를 가리키고 있지만
		 *Shape객체는 매개변수가 4개인 생성자가 없으므로 오류
		 *하지만 밑의 코드를 실행하기 위해 임의로 매개변수 2개인 생성자를 사용하여 Shape객체를 생성
		 */
		Triangle t = new Triangle(0, 0, 2, 3);
		Rectangle r = new Rectangle(0, 0, 3, 4);
		Circle c = new Circle(0, 0, 1);
		
		Shape[] sArray = new Shape[4];
		sArray[0] = s;
		sArray[1] = t;
		sArray[2] = r;
		sArray[3] = c;
		
		moveAll(sArray);
		//resizeAll(sArray, 3.0);
		/*Shape객체는 Resizable인터페이스를 구현하고 있지 않기 때문에
		 *Resizable인터페이스 배열은 Shape객체 배열을 가리킬 수 없다
		 */
		drawAll(sArray);
		
		Movable[] mArray = new Movable[4];
		mArray[0] = s;
		mArray[1] = t;
		mArray[2] = r;
		mArray[3] = c;
		
		moveAll(mArray);
		//resizeAll(mArray, 3.0);
		//Resizable인터페이스는 Movable인터페이스를 가리킬 수 없다
		//drawAll(mArray);
		/*Drawable인터페이스 참조 변수는  그 인터페이스를 구현한 클래스의 객체만을
		 *가리킬 수 있기 때문에 Movable인터페이스를 가리킬 수 없고
		 *Shape객체가 Movable인터페이스를 가리킬 수 없는 것은 데이터의 손실이 있기 때문에 
		 *자동형변환을 해주지 않기 때문이다
		 */
		
		Drawable[] dArray = new Drawable[4];
		dArray[0] = s;
		dArray[1] = t;
		dArray[2] = r;
		dArray[3] = c;
		
		//moveAll(dArray);
		/*Shape객체가 Movable인터페이스를 가리킬 수 없다 
		 *데이터의 손실이 있기 때문에 자동형변환을 해주지 않기 때문이다
		 *Movable인터페이스 참조 변수는  그 인터페이스를 구현한 클래스의 객체만을
		 *가리킬 수 있기 때문에 Drawable인터페이스를 가리킬 수 없다
		 */
		//resizeAll(dArray, 3.0);
		/*Resizable인터페이스 참조 변수는 그 인터페이스를 구현한 클래스의 객체만을
		 * 가리킬 수 있기 때문에 Drawable인터페이스를 가리킬 수 없다
		 */
		drawAll(dArray);
		

		Resizable[] rArray = new Resizable[4];
		//rArray[0] = s; 
		//참조변수 s가 가리키고 있는 Shape객체는 Resizable 인터페이스를 구현하고 있지 않다.
		rArray[1] = t;
		rArray[2] = r;
		rArray[3] = c;
		
		//moveAll(rArray);
		/*Shape객체가 인터페이스를 가리킬 수 있게 자동형변환을 해주지 않을 뿐더러
		 *Shape객체는 Resizable인터페이스를 구현하고 있지 않다 
		 */
		//resizeAll(rArray, 3.0);
		/*컴파일 에러가 나지 않지만 rArray[0]이 없기 때문에 resizeAll메소드에서 
		 *r[0].resize(x);가 실행되지않아 런타임에러가 난다
		 */
		//drawAll(rArray);
		/*Shape객체가 Movable인터페이스를 가리킬 수 없다
		 * 데이터의 손실이 있기 때문에 자동형변환을 해주지 않기 때문이다
		 * Drawable인터페이스 참조 변수는 그 인터페이스를 구현한 클래스의 객체만을
		 * 가리킬 수 있기 때문에 Resizable인터페이스를 가리킬 수 없다
		 */

	}
	
	public static void moveAll(Shape[] s) {
		Random rand = new Random();
		 
		for(int i = 0; i < s.length; i++) {
			int x = rand.nextInt(100);
			int y = rand.nextInt(100);
			
			s[i].setX(x);
			s[i].setY(y);
		}
	}
	
	public static void moveAll(Movable[] m) {
		for(int i = 0; i < m.length; i++) {
			m[i].move();
		}
	}
	
	public static void resizeAll(Resizable[] r, double x) {
		for(int i = 0; i < r.length; i++) {
			r[i].resize(x);
		}
	}

	public static void drawAll(Shape[] s) {
		for(int i = 0; i < s.length; i++) {
			s[i].draw();
		}
	}
	
	public static void drawAll(Drawable[] d) {
		for(int i = 0; i < d.length; i++) {
			d[i].draw();
		}
	}
}
