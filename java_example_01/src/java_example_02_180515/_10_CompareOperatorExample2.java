package java_example_02_180515;

public class _10_CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // 비교연산자 할때도 자동형변환 발생한다... v2가 double 타입으로 자동형변환
		
		double v4 = 0.1;
		float v5 = 0.1f; // 0.1f 근사치 실제 값은 0.10000000232424
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4*10) == (int)(v5*10));

	}

}
