package java_example_08_180525;

import java.util.Scanner;

public class _05_Practice {

	public static void main(String[] args) {
		
		_06_Practice xx = new _06_Practice();

		int z;
		double x;
		double y;
		double x2;
		double y2;
		int g;
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------");
			System.out.println("수행할 내용을 선택하세요.");
			System.out.println("1. 두점 사이의 거리 구하기");
			System.out.println("2. 절대값 구하기");
			System.out.println("선택>>");
			z=scan.nextInt();
			
			if(z==1) {
				System.out.println("두 점을 (x,y)순으로 입력해주세요.");
				System.out.println("1번째 x좌표");
				x=scan.nextInt();
				System.out.println("1번째 y좌표");
				y=scan.nextInt();
				System.out.println("2번째 x좌표");
				x2=scan.nextInt();
				System.out.println("2번째 y좌표");
				y2=scan.nextInt();
				xx.calculator(x, y, x2, y2);
			} else if(z==2) {
				System.out.println("정수를 입력해주세요.");
				g=scan.nextInt();
					if(g>0) {
						System.out.println("절대값 : "+g);
					} else if (g<0) {
						System.out.println("절대값 : "+-g);
					} else {
						System.out.println("절대값 : "+0);
					}
			} 
		}
		
		
		
		
		
		
		
		
		
	}

}
