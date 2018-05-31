package java_example_10_180529;

public class _10_Car {

	//필드 선언
	//타이어클래스 타입으로 선언됨 >> 객체 (_09_Tire)
	_09_Tire frontLeftTire = new _09_Tire("앞왼쪽", 6);
	_09_Tire frontRightTire = new _09_Tire("앞오른쪽", 2);
	_09_Tire BackLeftTire = new _09_Tire("뒤왼쪽", 3);
	_09_Tire BackRightTire = new _09_Tire("뒤오른쪽", 4);
	//위의 내용을 배열로
	
	//_09_Tire 클래스 타입의 배열 변수를 선언해서 우변에 있는 내용을 각각 배열 변수에 대입
	_09_Tire[] tire = new _09_Tire[100];
	
	_09_Tire[] tire1= {};
	
	_09_Tire[] tire2= {
			new _09_Tire("앞왼쪽", 6),
			new _09_Tire("앞오른쪽", 2),
			new _09_Tire("뒤왼쪽", 3),
			new _09_Tire("뒤오른쪽", 4),
	};
	
	
	//생성자
	
	//메소드
	int run() {
		
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {
			stop(); return 1;
		}
		if(frontRightTire.roll()==false) {
			stop(); return 2;
		}
		if(BackLeftTire.roll()==false) {
			stop(); return 3;
		}
		if(BackRightTire.roll()==false) {
			stop(); return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
		
	}
}
