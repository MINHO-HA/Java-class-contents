package java_example_03_180517;

import java.util.Scanner;
//중첩 if문
public class _05_IfNestedExample {

	public static void main(String[] args) {
		/*
		 * 점수를 입력 받고
		 * 
		 * 90점 이상인 점수에 대해 95점 이상이면 A+
		 * 90이상 95미만이면 A
		 * 85~89 B+
		 * 80~84 B
		 * 75~79 C+
		 * 70~74 C
		 * 65~69 D+
		 * 60~64 D
		 * 60미만   F
		 * 
		 * if문이 끝나면 학점을 출력하는 print문 사용
		 * 주의할 점은 학점 값을 처리하는 String 타입의 변수를 하나 사용
		 */
		
		System.out.println("점수를 입력해라");
		
		Scanner sc = new Scanner (System.in);
		
		//다형이가 설명해준거 
		//숫자는 인트로 선언해서 if문 안에 들어가고 >>코딩줄이기위해
		//핵심은 컴퓨터는 차례대로 읽는다.... 그러므로 변수,조건등등 다 읽게하고 나중에 살을 붙여라
		//여기선 문자열 ...학점입니다 입력하고 싶었으므로 일일이 다 입력하는것이 아닌 String 변수 하나 설정후
		//조건문 사이에 변수와 함께 문자를 입력하고
		//마지막에 그 변수 입력과 함께 + 살을 붙인다!!!!!!!!!!!!!!!!!!!
		int S = sc.nextInt();
		String C;
		
		if (S >= 90) {
			if (S >= 95) {
				C = "A+학점";
			} else {
				C = "A학점";
			}
		} else if (S >= 80) {
			if (S >= 85) {
				C = "B+학점";
			} else {
				C = "B학점";
			}
		} else if (S >= 70) {
			if (S >= 75) {
				C = "C+학점";
			} else {
				C = "C학점";
			}
		} else if (S >= 60) {
			if (S >= 65) {
				C = "D+학점";
			} else {
				C = "D학점";
			}
		} else {
			C = "F학점";
	}
		
		System.out.print(C + "입니다.ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
	

}
}
