import java.io.*;
import java.util.*;

public class Practice71 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		ArrayList<BankAccount> BankList = new ArrayList<BankAccount>();
		
		while(true) {
			System.out.print("원하는 작업을 입력하세요 (0-종료/1-열기/2-저장/3-계좌업무): ");
			int oper = input.nextInt();
			if (oper == 0) {
				break;
			}
			else if (oper == 1) {
				System.out.print("파일 이름을 입력하세요: ");
				String fname = input.next();
				System.out.println();
				
				load(fname, BankList);
			}
			else if (oper == 3) {
				System.out.print("업데이트할 계좌번호를 입력하세요: ");
				int number = input.nextInt();
				
				System.out.print("원하는 계좌 작업을 선택하세요 (1-입금/2-출금): ");
				int choice = input.nextInt();
				if(choice == 1) {
					System.out.print("입금액을 입력하세요: ");
					int money = input.nextInt();
					BankAccount ba = BankList.get(number-1);
					ba.deposit(money);
					BankList.set(number-1, ba);
					System.out.println("입금이 완료되었습니다.\n");
				}
				else if(choice == 2) {
					System.out.print("출금액을 입력하세요: ");
					int money = input.nextInt();
					
					try {
						BankAccount ba = BankList.get(number-1);
						ba.withdraw(money);
						BankList.set(number-1, ba);
						System.out.println("출금이 완료되었습니다.\n");
					}
					catch(NegativeBalanceException e) {
						System.out.println("출금할 금액이 잔고보다 많습니다. 다시 입력하세요.");
					}
				}
			}
			printAccountArray(BankList);
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	public static void printAccountArray(ArrayList<BankAccount> BankList) {
		System.out.println("현재 잔고현황입니다.");
		System.out.println("계좌번호\t계좌주\t\t잔고");
		System.out.println("1\t" + BankList.get(0));
		System.out.println("2\t" + BankList.get(1));
		System.out.println("3\t" + BankList.get(2));
	}
	
	public static void load(String fname, ArrayList<BankAccount> list) throws IOException {
		BankAccount[] BankArray = new BankAccount[3];
		Scanner s = null;
		
		try {
			s = new Scanner(new BufferedReader(new FileReader(fname)));
			int[] balance = new int[3];
			String[] owner = new String[3];
			int i = 0, j = 0;
			
			while (s.hasNext()) {
				if(s.hasNextInt()) {
					balance[i++] = s.nextInt();
				}
				else {
					owner[j++] = s.next();
				}
			}
			
			for(i = 0; i < balance.length; i++) {
				BankArray[i] = new BankAccount(owner[i], balance[i]);
				list.add(BankArray[i]);
			}
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

}
