package java_example_01;

import java.awt.HeadlessException;

public class VariableExample {
	//메인 메소드 선언
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//10을 변수 value의 초기값으로 저장
		/*int value = 10;*/
		int result;
		int value = 0;
		//무조건 선언?
		result = value + 10;
		
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		
		
		//변수 result값을 읽고 콘솔에 출력
		System.out.println(result);
		System.out.print("result");
		System.out.println("따옴표 안의 값은 그대로 출력된다, ln은 줄바꿈");
		System.out.println(value);
	}
}
