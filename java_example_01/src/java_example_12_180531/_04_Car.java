package java_example_12_180531;

public class _04_Car {

	//좌변: Tire 인터페이스 타입의 변수 frontLeftTire 선언
	//우변: 한국타이어 객체를 만듬
	_01_Tire frontLeftTire = new _02_HankookTire();
	_01_Tire frontRightTire = new _02_HankookTire();
	_01_Tire BackLeftTire = new _02_HankookTire();
	_01_Tire BackRightTire = new _02_HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
	}
}
