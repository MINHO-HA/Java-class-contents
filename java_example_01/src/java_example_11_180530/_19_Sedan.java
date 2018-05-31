package java_example_11_180530;

public class _19_Sedan extends _18_Car{

	_19_Sedan(int speed, String color){
		super(speed, color);	
	}
	
	@Override
	public void store() {
		System.out.println(this.color+"색상의 세단은"+this.speed+"의 최고속도를 가지며 사람을 태울 수 있다." );
	}
}
