package java_example_04_180518;

public class _02_Practice {

	public static void main(String[] args) {
		/*
		 * 문제 : 방정식 2x+4y=10의 모든 해를 구하시오.
		 * 0<=x, y<=10이고 모두 정수이다.
		 */

		for(int x=0; x<=10; x++) {
			for (int y=0; y<=10; y++) {
				if (2*x+4*y==10) {
					System.out.println(" x="+x+" y="+y);
					
				}
			}
		}
		
		/*int x = 0;
		int y = 0;
		int i = 0;
		
		for(x=0; i<=10 ; x+=2) {
			for(y=0; i<=10 ; y+=4) {
				i = x+y;
			}	
		} 	System.out.println(x);
			System.out.println(y);*/
		
		
/*		while(true) {
			z = z+(x+y);
			if(z == 10)
				break;
			x = x*2;
			y = y*4;
		} System.out.println(x);
		  System.out.println(y);*/
		
	}

}
