package java_example_07_180524;
//getter, setter 메소드를 사용하는 클래스
public class _16_CarExample {

	public static void main(String[] args) {
		_15_Car car = new _15_Car();
		
		//setter를 호출하여 속도 값을 설정
		//car.speed=100; <<안되는이유? private으로 설정되어 있기 때문에.....
		car.setSpeed(100);
		
		System.out.println("현재 속도 : "+car.getSpeed());
		//원래 여기까진 속도 100이였고
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println("현재 속도 : "+car.getSpeed());
		//위에 if문 만나면서 속도 줄었다....
	}

}
