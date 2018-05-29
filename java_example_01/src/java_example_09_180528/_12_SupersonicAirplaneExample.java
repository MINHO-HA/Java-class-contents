package java_example_09_180528;

public class _12_SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		_11_SupersonicAirplane sa = new _11_SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flymode=sa.SUPERSONIC;
		sa.fly();
		sa.flymode=sa.NORMAL;
		sa.fly();
		sa.land();

	}

}
