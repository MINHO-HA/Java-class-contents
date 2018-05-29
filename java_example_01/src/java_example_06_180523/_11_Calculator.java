package java_example_06_180523;
//method 연습 예제 p.217
public class _11_Calculator {

	//method 선언
	//메소드 이름 : PowerOn
	//메소드 리턴 타입 : void
	void PowerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	/*리턴타입>>*/int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	void PowerOff() {
		System.out.println("zzzzzzzzzzzzzzz");
	}
	
	
}
