package java_example_11_180530;

public class _14_PhoneExample {

	public static void main(String[] args) {
		
		//자식클래스 객체생성
		_13_SmartPhone smartphone = new _13_SmartPhone("하민호");
		
		//추상클래스의 객체 생성
		//_12_Phone phone = new _12_Phone("하민호");
		//추상클래스는 객체화 할수 없다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.inernetSerach();
		System.out.println(smartphone.owner);
	}

}
