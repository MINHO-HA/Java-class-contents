package java_projectExample_180604;

//사용자 정보 등록을 위한 클래스
public class _03_User {

	private String name;
	
	//열거형변수(Enumeration >> enum)
	private _04_payType payType; 	//CASH, CARD 밖에 변수값을 못가져간다.......
									//payType변수는 변수값을 enum에서 정의한 내용만 가질 수 있음.
	
	public _03_User(String name, _04_payType payType) {
		this.name=name;
		this.payType=payType;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public _04_payType getPayType() {
		return payType;
	}
	public void setPayType(_04_payType payType) {
		this.payType = payType;
	}
	
	
	
}
