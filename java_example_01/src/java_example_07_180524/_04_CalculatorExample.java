package java_example_07_180524;
//static 필드, 메소드 사용
public class _04_CalculatorExample {

	public static void main(String[] args) {
		
		double result1 =_03_Calculator.pi;

		int result2 = _03_Calculator.plus(10, 10);
		
		int result3 = _03_Calculator.minus(10, 10);
		
		System.out.println(result1);
		
		System.out.println(result2);
		
		System.out.println(result3);
	}

}
