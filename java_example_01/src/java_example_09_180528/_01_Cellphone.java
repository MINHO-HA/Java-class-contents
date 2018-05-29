package java_example_09_180528;
//부모클래스 Cellphone	
public class _01_Cellphone {
	//필드 선언
	String model;
	String color;
	
	//메소드 선언
	void powerOn() {
		System.out.println("전원 킴");
	}
	void powerOff() {
		System.out.println("전원 끔");
	}
	void bell() {
		System.out.println("벨 울림");
	}
	void sendVoice(String message) {
		System.out.println("자기 : "+message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 : "+message);
	}
	void hangUp() {
		System.out.println("통화종료");
	}
	
}
