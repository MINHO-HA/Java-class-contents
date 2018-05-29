package java_example_05_180521;

import java.lang.reflect.Array;
import java.util.Scanner;

public class _06_Practice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		int[] array = null;
		
		while (true) {
			
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("항목번호 선택 : ");
			
			int N = scan.nextInt();
			
			if(N==1) {
				//해야할 것!!
				//학생수를 입력받아 입력받은 값 만큼의 배열 크기로 설정
				
					System.out.println("학생수입력 : ");
					int J = scan.nextInt();
					array = new int[J];
					System.out.println("학생수 : "+J+"명");

				
			} else if (N==2) {
	
				//해야할 것!!
				//입력된 학생 수 만큼의 점수를 입력하여 배열에 저장
				
				for(int i=0;i<array.length;i++) {
					System.out.println(i+1+"번째 학생 점수입력 : ");
					array[i] = scan.nextInt();
			} 
					
				
			} 	else if(N==3) {
					
				//해야할 것!!
				//배열에 입력된 값을 하나하나 출력
				
					for(int i=0;i<array.length;i++) {
						System.out.println(i+1+"번째 학생 점수 :"+array[i]+"점");
					}

			} 	else if(N==4) {
				
				//배열에 입력된 값중 최대값과 평균값을 출력
				/*	for(int i=0;i<array.length;i++) {
						sum=sum+array[i];
						if(array[i]<array[i]+1) {
							max=array[i];
						}
					}
					System.out.println("최고점수 : "+max);
					System.out.println("평균 점수 : "+sum/array.length); 
					
				*/
				int max=0, sum=0;
				double avg=0;
				for(int i=0;i<array.length;i++) {
					sum +=array[i];
					/*max = (max<array[i])?array[i]:max;*/
					if(array[i]<array[i-1]) {
						max=array[i];
					}
				}
			System.out.println("최고점수 : "+max);
			System.out.println("평균점수  : "+sum/array.length);
			}
			
			
			
			
			
			
			
			
				else if(N==5) {
					
				//반복문 종료~~
					System.out.println("프로그램 종료");
					break;
					
			} 	else {
				
					System.out.println("항목번호 다시확인후 입력");
					N = scan.nextInt();
				}
			
		}
		
		/*do {
			if(N==1) {
				System.out.println("학생수입력 : ");
				int J = scan.nextInt();
				int array[] = new int[J];
				System.out.println("학생수"+J+"\n");
				System.out.println("항목번호 다시 선택 : ");
				N = scan.nextInt();
			}	
			
			else if(N==2) {
				
				for(int i=0;i<array.length;i++) {
					int array[] = new int[i];
					System.out.println(i+1+"번째 학생 점수입력 : ");
					int Y = scan.nextInt();
					System.out.println(i+1+"번째 학생 점수: "+Y+"\n");
					sum=sum+Y;
				} 
				System.out.println("항목번호 다시 선택 : ");
				N = scan.nextInt();
			} 
			
			else if(N==3) {
				int array[] = new int[3];
				System.out.println(array[0]);
				System.out.println("항목번호 다시 선택 : ");
				N = scan.nextInt();
			}
			
			else if(N==4) {
				System.out.println("평균 : "+ave);
				System.out.println("항목번호 다시 선택 : ");
				N = scan.nextInt();
				
			}
			
			else if(N==5) {
				System.out.println("프로그램 종료");
				break;
				
			} else {
				System.out.println("항목번호 다시확인후 입력");
				N = scan.nextInt();
			}
			
			
			
		} while(true);*/
		

	}

}
