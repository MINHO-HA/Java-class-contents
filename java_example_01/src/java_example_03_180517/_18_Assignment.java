package java_example_03_180517;

import java.util.Scanner;

public class _18_Assignment {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int inputNum = scan.nextInt();
		int i = 0;
		int sum = 0;
		
		System.out.println("입력한 수중 2와 3의 배수를 제외한 수는");
		
		for(i=1; i<=inputNum; i++) {
			if(!(i%2==0) && !(i%3==0)) {
				System.out.print( i+ " " );
				sum += i;
				
			} 
		} 
		
		System.out.println("이며 " + " 총합은 " + sum + "입니다. ");

	}

}
