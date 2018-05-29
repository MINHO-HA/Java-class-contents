package java_example_03_180517;

public class _16_BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			//주사위가 6이 나왔을 때 반복문 종료
			if(num==6) {
				break;
			}
		}

	}

}
