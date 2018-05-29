package java_example_03_180517;

public class _04_IfDiceExample {

	public static void main(String[] args) {
/* 다형이가 설명해준거
 * +1을 하는 이유는
 * 범위가 0부터시작 뒤에꺼는 곱하는수로 범위 나오는데
 * 0을 안나오게 하기 위해서 1을 더해준다!!!!!!!!!
 * random 메소드
 * Math.random() : double 실수  || 0.0<= 실수 <1.0
 * 1~9까지의 난수를 발생시키려면
 * (int)(Math.random()*10)
 * 1~10까지 난수
 * (int)(Math.random()*10)+1
 * 로또번호
 * (int)(Math.randon()*45)+1 
 * 
 * 
 * 주사위 번호뽑기
 * 1~6까지 난수를 발생해서
 * 1이 나오면 1번이 나왔습니다.
 * 2가 나오면 2번이 나왔습니다.
 * ~~~
 * 6이 나오면 6번이 나왔습니다.
 */

		/*int X = (int)(Math.random()*6)+1;
		
		if (X == 1) {
			System.out.println("1번");
		} else if (X == 2) {
			System.out.println("2번");
		} else if (X == 3) {
			System.out.println("3번");
		} else if (X == 4) {
			System.out.println("4번");
		} else if (X == 5) {
			System.out.println("5번");
		} else if (X == 6) {
			System.out.println("6번");
		} 
				*/
		
int X = (int)(Math.random()*3);
		
		if (X == 0) {
			System.out.println("0번");
		} else if (X == 1) {
			System.out.println("1번");
		} else if (X == 2) {
			System.out.println("2번");
		
				
		
	}

	}
}
