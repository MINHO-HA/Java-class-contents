package java_example_06_180523;
//CarExample 클래스
public class _04_CarExample {

	public static void main(String[] args) {
		// Car 클래스 객체 선언
		// Car 클래스에서 선언한 필드 값을 출력해보세요.
		_03_Car myCar = new _03_Car();
		
		/*String company = "현대자동차";
		String model = "그렌져";
		String color = "검정";
		int maxSpeed = 250;
		int speed;*/
		
		//필드값 출력
		System.out.println("Car 클래스의 company 필드값 : "+myCar.company);
		System.out.println("Car 클래스의 model 필드값 : "+myCar.model);
		System.out.println("Car 클래스의 color 필드값 : "+myCar.color);
		System.out.println("Car 클래스의 maxSpeed 필드값 : "+myCar.maxSpeed);
		System.out.println("Car 클래스의 speed 필드값 : "+myCar.speed);
		
		//필드값 변경
		//예시
		/*int number=10;
		number=30;*/
		myCar.speed=60;
		//필드값 변경 후 스피드 다시출력
		System.out.println("\n"+myCar.speed);
		myCar.color="노랑";
		System.out.println(myCar.color);
		

	}

}
