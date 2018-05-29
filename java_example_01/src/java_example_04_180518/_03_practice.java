package java_example_04_180518;

import java.util.Scanner;

public class _03_practice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자맞추기 게임\n숫자를 입력해줘");
		int num = (int)(Math.random()*100)+1;
		int i = scan.nextInt();
		int count = 1;
		
		while(true) {
			if(i==num) {
				System.out.println("짝짝짝 당첨 먹일사람 지목해!!!");
				break;
			} else if (i>num) {
				System.out.println("더 낮아\n아깝네ㅜㅜ");
				i = scan.nextInt();
			} else {
				System.out.println("더 높아\n거의 다 왔어");
				i = scan.nextInt();	
			} count++;
		} 
		System.out.println("입력횟수"+count);

		/*if (i==num) {
			System.out.println("정답입니다.");
			count++;
		} else if (i>num) {
			System.out.println("DOWN"); 
			i = scan.nextInt();
		} else {
			System.out.println("UP");
			i = scan.nextInt();
		}  System.out.println("입력횟수 : " + count);*/
		
	}
 
}
