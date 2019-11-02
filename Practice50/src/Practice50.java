import java.util.Random;

public class Practice50 {
	
	public static void main(String[] args) {
		Shape s = new Shape(0, 0);
		/*������ �Ű������� 4���� �����ڸ� ����Ͽ� Shape��ü�� ����Ű�� ������
		 *Shape��ü�� �Ű������� 4���� �����ڰ� �����Ƿ� ����
		 *������ ���� �ڵ带 �����ϱ� ���� ���Ƿ� �Ű����� 2���� �����ڸ� ����Ͽ� Shape��ü�� ����
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
		/*Shape��ü�� Resizable�������̽��� �����ϰ� ���� �ʱ� ������
		 *Resizable�������̽� �迭�� Shape��ü �迭�� ����ų �� ����
		 */
		drawAll(sArray);
		
		Movable[] mArray = new Movable[4];
		mArray[0] = s;
		mArray[1] = t;
		mArray[2] = r;
		mArray[3] = c;
		
		moveAll(mArray);
		//resizeAll(mArray, 3.0);
		//Resizable�������̽��� Movable�������̽��� ����ų �� ����
		//drawAll(mArray);
		/*Drawable�������̽� ���� ������  �� �������̽��� ������ Ŭ������ ��ü����
		 *����ų �� �ֱ� ������ Movable�������̽��� ����ų �� ����
		 *Shape��ü�� Movable�������̽��� ����ų �� ���� ���� �������� �ս��� �ֱ� ������ 
		 *�ڵ�����ȯ�� ������ �ʱ� �����̴�
		 */
		
		Drawable[] dArray = new Drawable[4];
		dArray[0] = s;
		dArray[1] = t;
		dArray[2] = r;
		dArray[3] = c;
		
		//moveAll(dArray);
		/*Shape��ü�� Movable�������̽��� ����ų �� ���� 
		 *�������� �ս��� �ֱ� ������ �ڵ�����ȯ�� ������ �ʱ� �����̴�
		 *Movable�������̽� ���� ������  �� �������̽��� ������ Ŭ������ ��ü����
		 *����ų �� �ֱ� ������ Drawable�������̽��� ����ų �� ����
		 */
		//resizeAll(dArray, 3.0);
		/*Resizable�������̽� ���� ������ �� �������̽��� ������ Ŭ������ ��ü����
		 * ����ų �� �ֱ� ������ Drawable�������̽��� ����ų �� ����
		 */
		drawAll(dArray);
		

		Resizable[] rArray = new Resizable[4];
		//rArray[0] = s; 
		//�������� s�� ����Ű�� �ִ� Shape��ü�� Resizable �������̽��� �����ϰ� ���� �ʴ�.
		rArray[1] = t;
		rArray[2] = r;
		rArray[3] = c;
		
		//moveAll(rArray);
		/*Shape��ü�� �������̽��� ����ų �� �ְ� �ڵ�����ȯ�� ������ ���� �Ӵ���
		 *Shape��ü�� Resizable�������̽��� �����ϰ� ���� �ʴ� 
		 */
		//resizeAll(rArray, 3.0);
		/*������ ������ ���� ������ rArray[0]�� ���� ������ resizeAll�޼ҵ忡�� 
		 *r[0].resize(x);�� ��������ʾ� ��Ÿ�ӿ����� ����
		 */
		//drawAll(rArray);
		/*Shape��ü�� Movable�������̽��� ����ų �� ����
		 * �������� �ս��� �ֱ� ������ �ڵ�����ȯ�� ������ �ʱ� �����̴�
		 * Drawable�������̽� ���� ������ �� �������̽��� ������ Ŭ������ ��ü����
		 * ����ų �� �ֱ� ������ Resizable�������̽��� ����ų �� ����
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
