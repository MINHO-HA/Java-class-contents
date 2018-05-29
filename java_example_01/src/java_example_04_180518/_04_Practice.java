package java_example_04_180518;

import java.util.Scanner;

public class _04_Practice {

	public static void main(String[] args) {
	
		
	Scanner scan = new Scanner (System.in);
	
	
	long balance = 0;
	long withdraw = 0;
	
	do 	{
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("번호입력해 : ");
		
		int choice = scan.nextInt();
		
		if(choice==1) {
				System.out.print("예금액 입력해 : ");
				int money = scan.nextInt();
				System.out.println("잔액 : ");
				balance = balance + money;
				System.out.println(balance);
		} 
		
		else if (choice==2) {
				System.out.print("출금액 입력해 : ");
				int money = scan.nextInt();
				System.out.println("잔액 : ");
				balance = balance - money;
				System.out.println(balance);
		} 
		
		else if (choice==3) {
				System.out.print("잔액 : ");
				System.out.println(balance);
		} 
		
		else if (choice==4) {
				System.out.println("종료");
				break;
		} 
		
		else {
				System.out.println("번호 다시 확인해라");
			
		}
	} while (true);
	
	
	
	

	
	}

}
