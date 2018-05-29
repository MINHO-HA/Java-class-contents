package java_example_07_180524;

public class _01_Car {

	//필드선언
	String brand;
	int speed;
	
	
	//생성자선언
	//생성자의 이름은 클래스와 동일하게 선언
	_01_Car(String brand){
		//넘겨받은 매개변수 값을 현재 필드에 저장
		this.brand=brand;
	}
	
	_01_Car(){
		//필드선언하면 기본값 null값
		//int는  0
	}
	
	
	//메소드 선언
	//일반 출력은 메소드타입 void!!!!!!!!!! 일반 값을 넘겨받는게 아니기때문에~~~~
	void run() {
		for(int i=10;i<=50;i+=10) {
			System.out.println(this.brand+"가 달립니다.(시속:"+i+"km/h)");
			//return;
		}
	}
	
	
}
