package java_example_06_180523;

public class _12_CalculatorExample {

	public static void main(String[] args) {
		//Calculator 객체생성
		
		//PowerOn 메소드 호출
		
		//plus 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		
		//divide 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		
		
		//PowerOff 메소드 호출
		_11_Calculator cal = new _11_Calculator();
		
		cal.PowerOn();
		System.out.println("---------------");
		cal.PowerOff();
		
		int resultzzz = cal.plus(10, 30);
		System.out.println("---------------");
		System.out.println(resultzzz);
		System.out.println("---------------");
		double zzz = cal.divide(50, 3);
		System.out.println(zzz);
		System.out.println("---------------");
		cal.plus(100, 200);
		System.out.println(cal.plus(10, 20)); //result로 보내서 다시 불러오기
		System.out.println("---------------");
		System.out.println(cal.divide(100, 23));
		System.out.println("---------------");

	}

}
