package JUN_ALGORISM;

import java.util.Scanner;

public class _12_2438 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int inputNum = scan.nextInt();
		int i = 0;
		int j = 0;
		
		for(i=1; i<=inputNum; i++) {
			for(j=0; j<i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
