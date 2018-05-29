package java_example_08_180525;

import java.util.Scanner;

public class _02_Student {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		_01_StudentMain student = new _01_StudentMain();
		student.aa();
		System.out.println("첫번째학생 이름과 과목점수입력");
		scan.next();
		scan.nextInt();
		scan.nextInt();
		scan.nextInt();
		System.out.println("두번째학생 이름과 과목점수입력");
		scan.next();
		scan.nextInt();
		scan.nextInt();
		scan.nextInt();
		System.out.println("세번째학생 이름과 과목점수입력");
		scan.next();
		scan.nextInt();
		scan.nextInt();
		scan.nextInt();	
		student.dd();
		
		
		

	}

}
