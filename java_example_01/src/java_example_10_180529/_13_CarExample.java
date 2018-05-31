package java_example_10_180529;

public class _13_CarExample {

	public static void main(String[] args) {
		//_10_Car 객체생성
		//_10_Car 클래스타입 변수 car 선언
		_10_Car car = new _10_Car();
		
		_09_Tire tire = new _09_Tire("aaa", 10);
		_11_HankookTire hktire = new _11_HankookTire("한국", 10);
		
		tire=hktire;//자식클래스 타입 변수를 부모클래스 타입 변수에 대입 >>>>>>자동타입변환발생
		//hktire=tire;//부모클래스 타입 변수를 자식클래스 타입 변수에 대입 >>>>>>자동타입변환안된다!!!!!!!!!!!!!!!!!
		
		//Car 객체의 run() 메소드 5번 반복실행
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
		
		
		switch(problemLocation) {
		
		case 1:
			System.out.println("앞왼쪽 HankookTire로 교체");
			car.frontLeftTire = new _11_HankookTire("앞왼쪽", 15);
			break;
		case 2:
			System.out.println("앞오른쪽 KumhoTire로 교체");
			car.frontRightTire = new _12_KumhoTire("앞오른쪽", 13);
			break;
		case 3:
			System.out.println("뒤왼쪽 HankookTire로 교체");
			car.BackLeftTire = new _11_HankookTire("뒤왼쪽", 14);
			break;
		case 4:
			System.out.println("뒤오른쪽 kumhoTire로 교체");
			car.BackRightTire = new _12_KumhoTire("뒤오른쪽", 17);
			break;
		}
		
		//1회전시 출력되는 내용을 구분
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println();
		}
	}

}
