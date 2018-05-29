package java_example_06_180523;
//생성자 Overloading 예제
public class _10_CarExample {

	public static void main(String[] args) {

		//1. 기본 생성자를 이용한 객체를 생성하여 필드값 출력
		
		//2. model 매개변수를 갖는 생성자를 이용한 객체를 생성하여 필드값 출력
		
		//3. model,color 매개변수를 갖는 생성자를 이용한 객체를 생성하여 필드값 출력
		
		//4. model,color,maxSpeed 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력

		
		_09_Car myCarr = new _09_Car("마티즈");
		System.out.println(myCarr.model+" "+myCarr.color+" "+myCarr.maxSpeed);
		
		_09_Car myCar = new _09_Car("에쿠스", "화이트");
		System.out.println(myCar.model+" "+myCar.color+" "+myCar.maxSpeed);

		_09_Car myCar2 = new _09_Car("소나타", "블랙");
		System.out.println(myCar2.model+" "+myCar2.color+" "+myCar2.maxSpeed);
		
		_09_Car myCar3 = new _09_Car("그렌져", "네이비", 300);
		System.out.println(myCar3.model+" "+myCar3.color+" "+myCar3.maxSpeed);
		
		
		
		
		
	}

}
