package java_example_03_180517;

import java.util.Scanner;

public class _15_Assignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("q입력시 종료");
		
		String content = sc.next();
		
		
		do {
			System.out.println(content);
			content = sc.next();
			
			
			
			
			
		} while (!content.equals("q"));
		sc.close();
		System.out.println("프로그램이 종료되었습니다.");
		
		

}
}
