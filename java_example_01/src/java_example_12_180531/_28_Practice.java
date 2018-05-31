package java_example_12_180531;

import java.util.Scanner;

public class _28_Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("두 숫자를 입력하면 나눠줄께");

		try {
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눴구나ㅎㅎㅎ 그건 가능하지 않아~~");
		} finally {
			System.out.println("finally 는 넣어도되고 안넣어도 되지만 무조건실행되");
		}

	}

}
