package java_example_11_180530;

public class _20_Truck extends _18_Car {

	_20_Truck(int speed, String color){
		super(speed, color);	
	}
	
	@Override
	public void store() {
		System.out.println(this.color+"색상의 트럭은"+this.speed+"의 최고속도를 가지며 짐을 실어 나를수 있다." );
	}
}
