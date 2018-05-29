package java_example_09_180529;

public class _17_Main {

	public static void main(String[] args) {
		
		//세단 객체생성
		_15_Sedan sedan = new _15_Sedan("red", 0);
		
		//세단 속도 증가, 카클래스(세단클래스의 부모클래스인 카클래스) 의 메소드 이용~~~
		sedan.increaseSpeed(200000000);
		sedan.seatSpace(5000);

		//트럭 객체생성
		_16_Truck truck = new _16_Truck("black", 0);
		
		//트럭 속도 증가, 카클래스의 메소드 이용~~~
		truck.increaseSpeed(10000000);
		truck.limitedLoadSpace("9000톤");
		
		System.out.println(sedan.color+" 승용차의 속도는 "+sedan.speed+" 이고 좌석수는 "+sedan.seatSpace+"개 입니다.");
		System.out.println(truck.color+" 트럭의 속도는 "+truck.speed+" 이고 적재량은 "+truck.limitedLoadSpace+"입니다.");
	}

}
