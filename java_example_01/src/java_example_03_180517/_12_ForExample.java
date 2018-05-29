package java_example_03_180517;

import java.util.Scanner;

public class _12_ForExample {

	public static void main(String[] args) {
		//출력 형태
		//1+2+3+4+5+6+7+8+9+10=55
		Scanner sc = new Scanner (System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int i, sum=0;
		
		for(i=X; i<=Y; i++) {
			/*sum += i;*/
			sum = sum + i;
			System.out.print(i);
			
			if(i<Y)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}
}
