package java_example_07_180524;

public class _20_PracticeExample {

	private String ownerName;
	private int accountNumber;
	private int balance;
//	int deposit;
//	int withdraw;
//	
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	_20_PracticeExample(){
		
	}
	
	
	
	public int deposit(int deposit) {
		this.balance+=deposit;
		return this.balance;
	}
	
	public int withdraw(int withdraw) {
		this.balance-=withdraw;
		return this.balance;
	}
	

	public void result() {
		System.out.println(getOwnerName());
		System.out.println(getAccountNumber());
		System.out.println(getBalance());
	}
	
	
	
	
	
	
}
