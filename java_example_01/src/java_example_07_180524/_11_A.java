package java_example_07_180524;
//생성자의 접근제한 예제
public class _11_A {
	//필드선언
	//a1, a2, a3 필드는 A클래스 타입으로 선언.......
	_11_A a1 = new _11_A(true);
	_11_A a2 = new _11_A(1);
	_11_A a3 = new _11_A("문자열");
	
	//생성자 선언
	public _11_A(boolean b) {	
	}
	
	_11_A(int b){
	}
	
	private _11_A(String s) {	
	}
	
	
	
}
