package java_example_02_180515;

import java.util.Scanner;

public class _15_ScannerExample {

	public static void main(String[] args) {
	
		//Scanner scan = new Scanner(System.in);
		//현재 프로그램에서 scan이라는 이름으로 Scanner 기능을 사용하겠다는 의미

/*
 * next() : 문자열 입력
 * nextInt() : 정수 입력
 * nextDouble() : 실수 입력
 * close() : 스캐너 종료
 */
	//	String name = scan.next();
	//	System.out.println("당신의 이름은 " + name + "입니다.");
		
	//	scan.close();
		/*System.out.println("이름, 도시, 나이, 체중을 빈칸으로 분리하여 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		String city = scan.next();
		int age = scan.nextInt();
		double weight = scan.nextDouble();
		
		System.out.println("당신의 이름은 " + name + "구나");
		System.out.println("당신의 도시는 " + city + "이구나 ");
		System.out.println("당신의 나이는 " + age + "살이구나");
		System.out.println("당신의 몸무게는 " + weight + "kg이구나");
		
		scan.close();*/
		System.out.println("초를 입력하세요:");
		
		Scanner scan = new Scanner(System.in);
		
		
		int second = scan.nextInt();
		
		
		System.out.println
		
		( (second / 3600) + "시간 " + ( (second % 3600) / 60) + "분 " + ( (second % 3600) % 60) + "초입니다." );

		
	}
}
