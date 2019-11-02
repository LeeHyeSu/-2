import java.io.*;
import java.util.*;

public class Practice70 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Scanner s = null;
		int num = 0;
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("�������� ����� ���� �̸��� �Է��ϼ���: ");
		String fileName = input.next();
		
		try {
			s = new Scanner(new BufferedReader(new FileReader(fileName)));
		
			while(s.hasNext()) {
				list.add(num, s.nextInt());
				num++;
			}
		} finally {
			if(s != null) {
				s.close();
			}
		}
		
		System.out.println("������ ������ ��� " + num + "���Դϴ�.");
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		for(int i = 0; i < num; i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		
		Collections.sort(list);
		
		System.out.println("���ĵ� ������ ������ �����ϴ�.");
		for(int i = 0; i < num; i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
	}

}
