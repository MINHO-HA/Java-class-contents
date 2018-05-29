package java_example_02_180515;
// 논리연산자
/*
 *  논리연산은 true, false 를 가지고 연산을 수행함.
 *  AND 연산 (&&)
 *  1. A && B : A, B 가 모두 true 면 결과는 true... 하나라도 false면 결과는 false
 *  OR 연산 (||)
 *  A || B : A, B 둘 중 하나라도 true 면 결과는 true... 둘다 false면 결과는 false
 *  NOT 연산(!)
 *  true > false, false > true
 */
public class _12_LogicalOperatorExample {

	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if( (charCode>=65) & ( charCode<=90) ) {
			System.out.println("대문자네");
		}
		
		int value = 6;
		
		if ( (value%2 == 0) || (value%3 == 0) ) {
			System.out.println("2 또는 3의 배수네");
		}
		
		
		

	}

}
