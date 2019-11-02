
public class BankAccount {
	private String owner;
	private int balance;
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public BankAccount() {
		this("¸ð¸§", -1);
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += owner + "\t\t" + balance;
		
		return rslt;
	}
	
	public void deposit(int money) {
		balance =  balance + money;
	}
	
	public void withdraw(int money) throws NegativeBalanceException {
		if(balance - money < 0) {
			throw (new NegativeBalanceException()); 
		}
		balance = balance - money;
	}
}
