package java_example_11_180530;

public abstract class _15_Animal {

	public String kind;
	
	static void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	//추상메소드 선언
	//추상메소드는 실행블록이 없고 단지 메소드이름, 리턴타입등만 선언!!!!!!!
	public abstract void sound();
}
