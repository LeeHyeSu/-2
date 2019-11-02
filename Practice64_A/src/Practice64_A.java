import java.util.*;

public class Practice64_A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		BankAccount[] BankArray = new BankAccount[3];
		Map<Integer, BankAccount> BankList = new HashMap<Integer, BankAccount>();
	
		for(int i = 0; i < BankArray.length; i++) {
			System.out.print("예금주 이름을 입력하세요: ");
			String owner = input.next();
			System.out.print("잔고를 입력하세요: ");
			int balance = input.nextInt();
			int account = r.nextInt(10000) + 1000;
			BankArray[i] = new BankAccount(owner, balance);
			BankList.put(account, BankArray[i]);
		}
		
		while(true) {
			System.out.println("현재 잔고현황입니다.");
			System.out.println("계좌번호\t계좌주\t\t잔고");
			printAccounts(BankList);
			
			System.out.print("업데이트할 계좌번호를 입력하세요 (종료-0): ");
			int number = input.nextInt();
			if(number == 0) {
				break;
			}
			
			System.out.print("원하는 작업을 선택하세요 (1-입금/2-출금): ");
			int choice = input.nextInt();
			if(choice == 1) {
				System.out.print("입금액을 입력하세요: ");
				int money = input.nextInt();
				BankAccount ba = BankList.get(number);
				ba.deposit(money);
				BankList.remove(number);
				BankList.put(number, ba);
				System.out.println("입금이 완료되었습니다.");
			}
			else if(choice == 2) {
				System.out.print("출금액을 입력하세요: ");
				int money = input.nextInt();
				
				try {
					BankAccount ba = BankList.get(number);
					ba.withdraw(money);
					BankList.remove(number);
					BankList.put(number, ba);
					System.out.println("출금이 완료되었습니다.");
				}
				catch(NegativeBalanceException e) {
					System.out.println("출금할 금액이 잔고보다 많습니다. 다시 입력하세요.");
				}
			}
		} 
		System.out.println("프로그램을 종료합니다.");
	}
	
	public static void printAccounts(Map<Integer, BankAccount> m) {
		for(Map.Entry<Integer, BankAccount> s : m.entrySet()) {
			Integer key = s.getKey();
			BankAccount value = s.getValue();
			System.out.println(key + "\t" + value);
		}
	}

}

