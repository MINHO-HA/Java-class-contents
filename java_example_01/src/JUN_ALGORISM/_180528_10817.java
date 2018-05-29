package JUN_ALGORISM;

import java.util.Scanner;

public class _180528_10817 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a>b) {
			if(b>c) {
				System.out.println(b);
			} else {
				if(a>c) {
					System.out.println(c);
				} else {
					System.out.println(a);
				}
			}
		} else if (a<b) {
			if(a>c) {
				System.out.println(a);
			} else {
				if(b>c) {
					System.out.println(c);
				} else {
					System.out.println(b);
				}
			}
		} else if (a==b) {
			if(a>c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		}
 				
	}

}
