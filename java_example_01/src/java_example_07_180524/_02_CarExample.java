package java_example_07_180524;

public class _02_CarExample {

	public static void main(String[] args) {

		_01_Car myCar = new _01_Car("포르쉐");
		//객체를 생성할 때 매개변수를 어떻게 전달했는지!!!!!
		//String 한개  >> 생성자를 선언
		_01_Car yourCar = new _01_Car("벤츠");
		_01_Car ourCar = new _01_Car();
		
		//메소드 호출
		//run() 메소드 호출했을 때 어떤 결과가 나오는지.....
		myCar.run();
		yourCar.run();
		ourCar.run();
		
		System.out.println(args);

	}

}
