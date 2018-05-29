package java_example_02_180515;

//삼항연산자 예제
/*
 * 형식 : (조건식)? 조건이 true일때의 결과 : 조건이 false일때의 결과
 */
public class _14_ConditionalOperationExample {

	public static void main(String[] args) {
		
		int score = 22;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println(score + "점은 " + grade);

	}

}
