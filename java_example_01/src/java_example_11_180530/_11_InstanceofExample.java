package java_example_11_180530;

public class _11_InstanceofExample {

	
	//method1의 매개변수 : _09_Parent 클래스 타입의 변수 parent
	public static void method1(_09_Parent parent) {
		
		//parent 변수가 _10_Child 클래스 타입인지????
		if(parent instanceof _10_Child) {
			//parent 변수를 child 클래스타입으로 강제형변환해서
			//child 클래스 타입의 변수 child에 대입한다.
			_10_Child child = (_10_Child) parent;
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환되지 않음");
		}
	}
	
	//강제 형변환이 가능한지 여부를 묻지 않고 강제 형변환 수행하는 메소드
	public static void method2(_09_Parent parent) {
		_10_Child child = (_10_Child) parent;
		System.out.println("method2- child로 변환성공");
	}
		
	public static void main (String [] args) {
		/*
		 * 객체 타입 확인을 위한 instanceof 연산자
		 * 강제타입변환이 가능한지 여부를 판단하기 위해 사용하는 연산자
		 */
		
		//Parent 타입의 변수를 선언해서 Child 객체를 대입
		//method1, 2를 각각 호출
		_09_Parent parent1 = new _10_Child();
		method1(parent1);
		method2(parent1);
		
	
		
		//parent 타입의 변수를 선언해서 parent 객체를 대입
		//method1, 2를 각각 호출
		_09_Parent parent2 = new _09_Parent();
		method1(parent2);
		method2(parent2);
		
	}
}
