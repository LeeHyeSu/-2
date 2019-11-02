import java.io.*;
import java.util.*;

public class Practice69 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("원하는 난수의 개수를 입력하세요: ");
		int n = input.nextInt();
		System.out.print("난수값의 범위를 설정하세요: ");
		int rage = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			list.add(r.nextInt(rage + 1));
		}
		
		System.out.println("생성된 난수는 다음과 같습니다.");
		for(int value : list) {
			System.out.print(value + "\t");
		}
		System.out.println();
		
		PrintWriter out = null;
		System.out.print("난수값을 저장할 파일 이름을 입력하세요: ");
		String fileName = input.next();
		out = new PrintWriter(new FileWriter(fileName));
		for(int i = 0; i < n; i++) {
			out.println(list.get(i));
		}
		out.flush();
		System.out.println("파일 " + fileName + "에 난수값이 저장되었습니다.");
		
		if(out != null)
			out.close();
	}

}
