package java_example_03_180517;

import java.util.Scanner;

public class _08_Practice {

	public static void main(String[] args) {

		//60점이상 합격 미만 불합격
		//4학년은 70점 이상 합격 미만 불합격
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("학년과 성적을 차례대로 입력해라");
		
		int grade = sc.nextInt();
		int score = sc.nextInt();
		//String A;
		//String B;
	
		if(score>=60) {
			if(grade != 4) 
				System.out.println("60점이상");
			else if (score >= 70) 
				System.out.println("4학년이네 70점이상");
			else  
				System.out.println("불합격입니다.");
		}	else 
			System.out.println("불합격입니다.");
		
		A +"합격"
		B +"불합격"

	}
	
}




