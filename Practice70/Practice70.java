import java.io.*;
import java.util.*;

public class Practice70 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Scanner s = null;
		int num = 0;
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("난수값이 저장된 파일 이름을 입력하세요: ");
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
		
		System.out.println("난수의 개수는 모두 " + num + "개입니다.");
		System.out.println("입력된 난수는 다음과 같습니다.");
		for(int i = 0; i < num; i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		
		Collections.sort(list);
		
		System.out.println("정렬된 난수는 다음과 같습니다.");
		for(int i = 0; i < num; i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
	}

}
