import java.io.*;
import java.util.*;

public class Practice71 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		ArrayList<BankAccount> BankList = new ArrayList<BankAccount>();
		
		while(true) {
			System.out.print("���ϴ� �۾��� �Է��ϼ��� (0-����/1-����/2-����/3-���¾���): ");
			int oper = input.nextInt();
			if (oper == 0) {
				break;
			}
			else if (oper == 1) {
				System.out.print("���� �̸��� �Է��ϼ���: ");
				String fname = input.next();
				System.out.println();
				
				load(fname, BankList);
			}
			else if (oper == 3) {
				System.out.print("������Ʈ�� ���¹�ȣ�� �Է��ϼ���: ");
				int number = input.nextInt();
				
				System.out.print("���ϴ� ���� �۾��� �����ϼ��� (1-�Ա�/2-���): ");
				int choice = input.nextInt();
				if(choice == 1) {
					System.out.print("�Աݾ��� �Է��ϼ���: ");
					int money = input.nextInt();
					BankAccount ba = BankList.get(number-1);
					ba.deposit(money);
					BankList.set(number-1, ba);
					System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.\n");
				}
				else if(choice == 2) {
					System.out.print("��ݾ��� �Է��ϼ���: ");
					int money = input.nextInt();
					
					try {
						BankAccount ba = BankList.get(number-1);
						ba.withdraw(money);
						BankList.set(number-1, ba);
						System.out.println("����� �Ϸ�Ǿ����ϴ�.\n");
					}
					catch(NegativeBalanceException e) {
						System.out.println("����� �ݾ��� �ܰ��� �����ϴ�. �ٽ� �Է��ϼ���.");
					}
				}
			}
			printAccountArray(BankList);
			System.out.println();
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
