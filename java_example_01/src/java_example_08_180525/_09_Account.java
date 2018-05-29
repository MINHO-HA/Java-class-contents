package java_example_08_180525;
//Account 클래스
public class _09_Account {
	//필드선언
	private String ano; //계좌번호를 위한 필드
	private String owner; //예금주를 위한 필드
	private int balance; //잔액을 위한 필드
	
	public _09_Account() {
		
	}
	
	//생성자 선언
	public _09_Account(String ano, String owner, int balance) {
		this.ano=ano;
		this.owner=owner;
		this.balance=balance;
	}

	//getter, setter 메소드 선언
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
