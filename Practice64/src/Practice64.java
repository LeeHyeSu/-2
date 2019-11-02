import java.util.*;

public class Practice64 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount[] BankArray = new BankAccount[3];
		ArrayList<BankAccount> BankList = new ArrayList<BankAccount>();
	
		for(int i = 0; i < BankArray.length; i++) {
			System.out.print("예금주 이름을 입력하세요: ");
			String owner = input.next();
			System.out.print("잔고를 입력하세요: ");
			int balance = input.nextInt();
			BankArray[i] = new BankAccount(owner, balance);
			BankList.add(BankArray[i]);
		}
		
		while(true) {
			printAccountArray(BankList);
			
			System.out.print("업데이트할 계좌번호를 입력하세요 (종료-0): ");
			int number = input.nextInt();
			if(number == 0) {
				break;
			}
			else if(number < 1 || number > 3) {
				continue;
			}
			
			System.out.print("원하는 작업을 선택하세요 (1-입금/2-출금): ");
			int choice = input.nextInt();
			if(choice == 1) {
				System.out.print("입금액을 입력하세요: ");
				int money = input.nextInt();
				BankAccount ba = BankList.get(number-1);
				ba.deposit(money);
				BankList.set(number-1, ba);
				System.out.println("입금이 완료되었습니다.");
			}
			else if(choice == 2) {
				System.out.print("출금액을 입력하세요: ");
				int money = input.nextInt();
				
				try {
					BankAccount ba = BankList.get(number-1);
					ba.withdraw(money);
					BankList.set(number-1, ba);
					System.out.println("출금이 완료되었습니다.");
				}
				catch(NegativeBalanceException e) {
					System.out.println("출금할 금액이 잔고보다 많습니다. 다시 입력하세요.");
				}
			}
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

}
