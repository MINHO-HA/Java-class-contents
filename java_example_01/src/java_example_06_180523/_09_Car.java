package java_example_06_180523;
// 생성자 (Constructor) Overloading 예제
public class _09_Car {
	
	//field 선언
	String company="현대자동차";
	String model;
	String color;
	double maxSpeed;
	
	//여러 종류의 생선자 선언해보기
	//1. 기본생성자
	//2. model을 매개변수로 하는 생성자
	//3. model.color를 매개변수로 하는 생성자
	//4. model, color, maxSpeed를 매개변수로 하는 생성자
	_09_Car(){
		
	}	
	
	_09_Car(String model){
		/*this.model=model;*/
		this(model,"은갈치색",3600);
		//현재 클래스에 있는 (String, String, int)형태의 생성자를 호출하여 매개값을 
		//넘길 때 사용하는 this()방법
	}
	
	
	_09_Car(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	_09_Car(String model, String color, int maxSpeed)  {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
}
