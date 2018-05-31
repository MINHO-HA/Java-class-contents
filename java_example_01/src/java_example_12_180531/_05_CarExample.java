package java_example_12_180531;

public class _05_CarExample {

	public void main(String[] args) {
		_04_Car mycar = new _04_Car();
		
		mycar.run();
		
		mycar.frontLeftTire = new _03_KumhoTire();
		mycar.frontRightTire = new _03_KumhoTire();
		
		mycar.run();
		System.out.println("dd");
	}
}
