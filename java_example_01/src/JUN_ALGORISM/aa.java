package JUN_ALGORISM;

import java.util.Scanner;

public class _180528_10871 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		int[] A;
		A = new int[N];
		

		for(int i=0;i<A.length; ++i) {
			A[i]=scan.nextInt();
			
		} 
		scan.close();
		
		for (int i=0;i<A.length; ++i) {
			if(A[i]<X) {
				System.out.println(A[i]+" ");
			}
		}
		
	
		
		
		
		
		
		
 	}
}
