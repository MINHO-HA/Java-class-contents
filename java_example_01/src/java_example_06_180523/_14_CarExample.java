package java_example_06_180523;

public class _14_CarExample {

	public static void main(String[] args) {
		
		
		_13_Car Car = new _13_Car();
		
		Car.setGas(5); //setGas 메소드 호출
		
		//isLeftGas 메소드 호출결과를 gasState라는 변수에 담으세요.
		boolean gasState = Car.isLeftGas();
		
		if(gasState) {
			System.out.println("출바알~~~~~");
			Car.run();
		}
		
		System.out.println(Car.isLeftGas());
		
		//헷갈리면 이런식으로 중간중간 확인필요!!!!
		System.out.println(Car.gas);
		
		if(Car.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}

	}

}
