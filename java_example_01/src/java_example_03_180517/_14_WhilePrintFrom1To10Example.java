package java_example_03_180517;

//While문 연습
public class _14_WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		/*int i = 1;
		while (i<=10) {
			//while문의 조건식을 만족한느 동안 실행됨.
			System.out.println(i);
			//i++;
			i+=2;
		}*/

		int i = 1;
		int sum = 0;
		while (i<=100) {
			sum += i;
			i++;
		} System.out.println(sum);
	}

}
