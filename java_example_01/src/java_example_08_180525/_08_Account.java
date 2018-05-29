package java_example_08_180525;

public class _08_Account {

	int balance;
	//상수 선언
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
		
	}

	public void setBalance(int balance) {
		// 0<=balance<=1000000
		if(balance <= MIN_BALANCE || balance > MAX_BALANCE) {
			
		} else {
			this.balance=balance;
		}
	}
	
	

	
	
	
	
	
	
	
}
