package java_example_04_180518;

import java.util.Scanner;

public class _08_Practice {

	public static void main(String[] args) {
		/*
		 * 3열짜리 1차원 배열을 선언하고
		 * 스캐너를 이용하여 값을 하나하나 입력하고
		 * 입력된 값의 총합 및 평균 값을 구하시오.
		 */
		System.out.println("숫자 차례대로 3번 입력해");
		Scanner scan = new Scanner (System.in);
		
		int sum = 0;
		int ave = 0;
		
		int array [] = new int [3];
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
			sum = sum + array[i];
			ave = sum / array.length;
			
		} 	System.out.println("총합 : " + sum);
			System.out.println("평균 : " + ave);
	}

}
