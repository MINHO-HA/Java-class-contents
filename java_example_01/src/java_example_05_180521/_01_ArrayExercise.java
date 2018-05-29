package java_example_05_180521;

import java.util.Scanner;

public class _01_ArrayExercise {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 양수 5개를 입력받아서 배열을 저장하고,
		 * 입력받은 수 중 가장 큰 수를 대로 배열하는 프로그램을 작성하시오.
		 */
			
		Scanner scan = new Scanner(System.in);
		
		//int k = 0;
		
		/*int array[] = new int [5];
		for(int i=0; i<array.length; i++) {
				array[i] = scan.nextInt(); 
			if(array[j]<array[i]) {
				j=i+1;
			}
		} System.out.println(array[j]);*/

		/*int array[] = new int [5];
		for(int i=0; i<array.length; i++) {
				array[i] = scan.nextInt(); 
		}
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]<array[j]) {
					k = array[i];
					array[i] = array[j];
					array[j] = k;
				} 
			
			} System.out.println(array[i]);
		} */
		
		int k = 0;
		int array[] = new int[5];
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		
		
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
					if(array[i]<array[j]) {
						k=array[i];
						array[i]=array[j];
						array[j]=k;
					}
			}	System.out.println(array[i]);
		}	

		
		
		
		
			
	
		
		
		
		
	}
}
