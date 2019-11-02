import java.util.*;

public class Practice64 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount[] BankArray = new BankAccount[3];
		ArrayList<BankAccount> BankList = new ArrayList<BankAccount>();
	
		for(int i = 0; i < BankArray.length; i++) {
			System.out.print("������ �̸��� �Է��ϼ���: ");
			String owner = input.next();
			System.out.print("�ܰ� �Է��ϼ���: ");
			int balance = input.nextInt();
			BankArray[i] = new BankAccount(owner, balance);
			BankList.add(BankArray[i]);
		}
		
		while(true) {
			printAccountArray(BankList);
			
			System.out.print("������Ʈ�� ���¹�ȣ�� �Է��ϼ��� (����-0): ");
			int number = input.nextInt();
			if(number == 0) {
				break;
			}
			else if(number < 1 || number > 3) {
				continue;
			}
			
			System.out.print("���ϴ� �۾��� �����ϼ��� (1-�Ա�/2-���): ");
			int choice = input.nextInt();
			if(choice == 1) {
				System.out.print("�Աݾ��� �Է��ϼ���: ");
				int money = input.nextInt();
				BankAccount ba = BankList.get(number-1);
				ba.deposit(money);
				BankList.set(number-1, ba);
				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
			}
			else if(choice == 2) {
				System.out.print("��ݾ��� �Է��ϼ���: ");
				int money = input.nextInt();
				
				try {
					BankAccount ba = BankList.get(number-1);
					ba.withdraw(money);
					BankList.set(number-1, ba);
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				}
				catch(NegativeBalanceException e) {
					System.out.println("����� �ݾ��� �ܰ��� �����ϴ�. �ٽ� �Է��ϼ���.");
				}
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public static void printAccountArray(ArrayList<BankAccount> BankList) {
		System.out.println("���� �ܰ���Ȳ�Դϴ�.");
		System.out.println("���¹�ȣ\t������\t\t�ܰ�");
		System.out.println("1\t" + BankList.get(0));
		System.out.println("2\t" + BankList.get(1));
		System.out.println("3\t" + BankList.get(2));
	}

}
