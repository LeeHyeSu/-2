import java.util.*;

public class Practice64_A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		BankAccount[] BankArray = new BankAccount[3];
		Map<Integer, BankAccount> BankList = new HashMap<Integer, BankAccount>();
	
		for(int i = 0; i < BankArray.length; i++) {
			System.out.print("������ �̸��� �Է��ϼ���: ");
			String owner = input.next();
			System.out.print("�ܰ� �Է��ϼ���: ");
			int balance = input.nextInt();
			int account = r.nextInt(10000) + 1000;
			BankArray[i] = new BankAccount(owner, balance);
			BankList.put(account, BankArray[i]);
		}
		
		while(true) {
			System.out.println("���� �ܰ���Ȳ�Դϴ�.");
			System.out.println("���¹�ȣ\t������\t\t�ܰ�");
			printAccounts(BankList);
			
			System.out.print("������Ʈ�� ���¹�ȣ�� �Է��ϼ��� (����-0): ");
			int number = input.nextInt();
			if(number == 0) {
				break;
			}
			
			System.out.print("���ϴ� �۾��� �����ϼ��� (1-�Ա�/2-���): ");
			int choice = input.nextInt();
			if(choice == 1) {
				System.out.print("�Աݾ��� �Է��ϼ���: ");
				int money = input.nextInt();
				BankAccount ba = BankList.get(number);
				ba.deposit(money);
				BankList.remove(number);
				BankList.put(number, ba);
				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
			}
			else if(choice == 2) {
				System.out.print("��ݾ��� �Է��ϼ���: ");
				int money = input.nextInt();
				
				try {
					BankAccount ba = BankList.get(number);
					ba.withdraw(money);
					BankList.remove(number);
					BankList.put(number, ba);
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				}
				catch(NegativeBalanceException e) {
					System.out.println("����� �ݾ��� �ܰ��� �����ϴ�. �ٽ� �Է��ϼ���.");
				}
			}
		} 
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public static void printAccounts(Map<Integer, BankAccount> m) {
		for(Map.Entry<Integer, BankAccount> s : m.entrySet()) {
			Integer key = s.getKey();
			BankAccount value = s.getValue();
			System.out.println(key + "\t" + value);
		}
	}

}

