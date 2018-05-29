package java_example_05_180521;

import java.util.Scanner;

public class _02_Practice {

	public static void main(String[] args) {
		/*
		 * 거스름돈 문제
		 * 어떤 금액을 입력하게 되면 각 동전이 몇 개씩 필요한지 출력하는 문제
		 * 가능한 적은 수의 동전을 거슬러 줄 수 있도록
		 * 예를 들어
		 * 2680원 이면
		 * 500원 : 5개
		 * 100원 : 1개
		 * 50원 : 1개
		 * 10원 : 3개
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = {500,100,50,10};
		
		/*int f;
		int o;
		int x;
		int y;*/
		int inputMoney = scan.nextInt();
		int x=0;
		int y=0;
		
		for(int i=0; i<array.length; i++) {
			inputMoney = inputMoney/array[i];
			y=inputMoney%array[i];
		} System.out.println(y);
		
		/*if(true) {
			f=inputMoney/array[0];
			o=(inputMoney%array[0])/array[1];
			x=((inputMoney%array[0])%array[1])/array[2];
			y=(((inputMoney%array[0])%array[1])%array[2])/array[3];
		} 
			System.out.println("500원 : "+f+"개");
			System.out.println("100원 : "+o+"개");
			System.out.println("50원 : "+x+"개");
			System.out.println("10원 : "+y+"개");
	*/
		
		
		
		
		
		
		
		
		/*int f=0;
		int o=0;
		int x=0;
		int y=0;
		
		int inputNum = scan.nextInt();
		int money = 0;
		
		
		if(inputNum>500) {
			f=inputNum/500;
			o=(inputNum%500)/100;
			x=((inputNum%500)%100)/50;
			y=(((inputNum%500)%100)%50)/10;
		} 
			
			System.out.println("500원 : "+f+"개");
			System.out.println("100원 : "+o+"개");
			System.out.println("50원 : "+x+"개");
			System.out.println("10원 : "+y+"개");*/
		
		
		
		
		

	}

}
