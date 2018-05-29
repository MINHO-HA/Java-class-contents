package java_example_09_180528;
//자식 클래스
public class _11_SupersonicAirplane extends _10_Airplane {
	
	//1의 값을 갖는 NORMAL 상수 정의
	//2의 값을 갖는 SUPERSONIC 상수 정의
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	//fly 메소드 재정의
	@Override
	public void fly() {
		
		if(flymode==SUPERSONIC) {
			System.out.println("초음속비행합니다.");
			
		} else {
			
			//부모클래스의 메소드 호출
			super.fly();
		}
	}
	
}
