package java_example_12_180531;

import java.util.Arrays;
import java.util.Collections;

public class _32_ArrayMethod {

	public static void main(String[] args) {
		int[] score = {100,80,90};
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		
		

		System.out.println("---------------");
		
		Arrays.sort(score); //오름차순~~~~~~~~~정렬 string도 가능~~~~
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		System.out.println("---------------");
		System.out.println("---------------");
		String[] score1 = {"가나다","하하하","우케케"};
		for(int i=0;i<score1.length;i++) {
			System.out.println(score1[i]);
		}
		System.out.println("---------------");
		Arrays.sort(score1, Collections.reverseOrder()); //내림차순 정렬~~~~~~~
		for(int i=0;i<score1.length;i++) {
			System.out.println(score1[i]);
		}
	}

}
