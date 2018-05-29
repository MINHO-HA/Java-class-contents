package java_example_03_180517;

import java.util.Scanner;
//if, else if, else if,...., else
public class _03_IfElseIfElseExample {

	public static void main(String[] args) {
		/*
		 * 점수를 스캔으로 입력 받아서
		 * 90이상이면 점수가 90~100입니다. 등급은 A
		 * 80이상 90미만이면 점수가 80~89입니다. 등급은 B
		 * ,,,,,,,,D까지
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("점수입력해라");
		
		int i = sc.nextInt();
		
		if (i >= 90) {
			System.out.println("점수가 90~100 \nㅋㅋㅋㅋㅋㅋ");
			System.out.println("등급은 A");
		} else if (i >= 80 /*수학적 기호로 사용시 && 붙여서 사용가능*/) {
			//예를 들어 위에 조건대신 i >= 80 && i < 90 으로 사용가능!!
			//println 대신 따옴표안에 역슬래쉬n으로 줄바꾸기 가능 (\n)
			System.out.println("점수가 80~89");
			System.out.println("등급은 B");
		} else if (i >= 70 ) {
			System.out.println("점수가 70~79");
			System.out.println("등급은 C");
		} else if (i >= 60) {
			System.out.println("점수가 60~69");
			System.out.println("등급은 D");
		} else {
			System.out.println("재수강이나해라");
			System.out.println("뭘바라니 F지");
		
		
		
		
		}

	}
	
}
