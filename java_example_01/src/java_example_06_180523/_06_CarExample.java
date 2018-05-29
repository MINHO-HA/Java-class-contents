package java_example_06_180523;
//CarExample 클래스
public class _06_CarExample {

	public static void main(String[] args) {
		//기본 생성자가 아닌 다른 생성자를 통해 객체 생성
		_05_Car myCar = new _05_Car("검정",300);
		//String color="검정", int cc=300으로 필드 초기화 하면서 객체생성.
		
		_05_Car myCar1 = new _05_Car("빨강",2000);
		_05_Car myCar2 = new _05_Car("흰색",4500);
		
		//_05_Car myCar3 = new _05_Car("흰색"); 변수 하나라.... 두개설정되어있어서...
		//_05_Car myCar3 = new _05_Car(5000, "흰색"); 타입 잘못되었다.....
	
		
	}

}
