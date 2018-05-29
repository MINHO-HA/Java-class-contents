package java_example_03_180517;

import java.util.Scanner;

public class _17_Assignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int inputNum = sc.nextInt();
		
		int i = 0;
		int sum = 0;
		double average = 0;
		
		while (!(inputNum == 0)) {
			
			i++;
			sum = sum + inputNum;
			average = sum/i;
			inputNum = sc.nextInt();
			
			
		} 	sc.close();
			System.out.println("수의 개수는" + i + "이며 평균은" + average  );
			
			
		
	}

}
