package java_example_04_180518;
 //배열 선언 예제 p. 152
public class _05_ArrayCreatedByValueListExample {

	public static void main(String[] args) {
		//배열 선언: int 타입의 scores라는 배열 변수 선언
		//배열선언 방법 첫번째
		//int[] scores;
		//배열선언 방법 두번째
		int[] scores = {83,90,88};
		
		//배열 값 접근(출력)
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		//배열 요소들의 합 구하기
		int sum = 0;
		for (int i = 0; i<=2; i++) {
			//sum = scores[0]+scores[1]+scores[2]
			//sum = sum + scores[0]
			//sum = sum + scores[1]
			//sum = sum + scores[2]
			
			sum = sum+ scores[i];
		}	
		System.out.println("총합 : "+sum);
		double ave = sum/3;
		System.out.println("평균 : "+ave);
	}

}
