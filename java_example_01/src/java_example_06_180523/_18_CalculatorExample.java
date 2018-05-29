package java_example_06_180523;

public class _18_CalculatorExample {

	public static void main(String[] args) {
		
		_17_Calculator cal = new _17_Calculator();
		
		double z = cal.areaRectangle(10);
		double z1 = cal.areaRectangle(10, 200);
		
		System.out.println(z);
		System.out.println(z1);
		
		System.out.println("폭이 20인 정사각형의 넓이 : ");
		System.out.println(cal.areaRectangle(20));
		System.out.println("----------------------------");
		System.out.println("폭이 10이고 높이가 200인 직사각형의 넓이 : ");
		System.out.println(cal.areaRectangle(10, 200));

	}

}
