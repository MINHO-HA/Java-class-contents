package java_example_09_180529;

public class _03_Car {

	//필드, 메소드, final메소드 선언
	
	String color;
	
	/*_03_Car(String color){
		this.color=color;
	}
	*/
	public void colorSelect() {
		System.out.println("블랙 선택ddddddddddddddd");
	}
	
	public final void colorChange() {
		System.out.println("화이트로 변경zzzzzzzzzzzzzzzzzzzz");
	}
	
	//또다른 클래스 SportCar 클래스 선언, final 메소드 재정의
}
