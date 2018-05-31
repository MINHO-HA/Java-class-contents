package java_example_11_180530;

public class _16_Dog extends _15_Animal {

	public _16_Dog() {
		this.kind="포유류";
	}
	
	//부모클래스에서 정의된 추상메소드를 구체화
	@Override
	public void sound() {
		System.out.println("왈왈~");
	}
}
