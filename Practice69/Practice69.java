import java.io.*;
import java.util.*;

public class Practice69 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("���ϴ� ������ ������ �Է��ϼ���: ");
		int n = input.nextInt();
		System.out.print("�������� ������ �����ϼ���: ");
		int rage = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			list.add(r.nextInt(rage + 1));
		}
		
		System.out.println("������ ������ ������ �����ϴ�.");
		for(int value : list) {
			System.out.print(value + "\t");
		}
		System.out.println();
		
		PrintWriter out = null;
		System.out.print("�������� ������ ���� �̸��� �Է��ϼ���: ");
		String fileName = input.next();
		out = new PrintWriter(new FileWriter(fileName));
		for(int i = 0; i < n; i++) {
			out.println(list.get(i));
		}
		out.flush();
		System.out.println("���� " + fileName + "�� �������� ����Ǿ����ϴ�.");
		
		if(out != null)
			out.close();
	}

}
