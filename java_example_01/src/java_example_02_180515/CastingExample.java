package java_example_02_180515;

//강제 타입변환 예제(작은거에서 큰거로는 자동변환가능하지만..)
//큰거에서 작은거로는 안된다..
public class CastingExample {

	public static void main(String[] args) {
		int intValue = 114313254;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 4.14244;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		

	}

}
