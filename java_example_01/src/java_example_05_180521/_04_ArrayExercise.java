package java_example_05_180521;

import java.util.Scanner;

public class _04_ArrayExercise {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		String[][] words = {
				{"대한민국","서울"},
				{"스페인","마드리드"},
				{"포르투갈","리스본"},
				{"캐나다","오타와"},
				{"태국","방콕"}
		};
		System.out.println("수도 맞추기 게임^~^\n");
		String text = null;
		int count=0;
		double ave=0;
		//String text = scan.nextLine();
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i][0]);
			System.out.println("정답은?\n(아래에 정답을 입력해)");
			if(words[i][1].equals(text = scan.nextLine())) {
				System.out.println("정답!!!!!!!!!!!!!\n");
				count++;
			} else {
				System.out.println("땡!!!!!!!!!!!!\n");
			}
		}	System.out.println("정답갯수 : "+count);
			ave=(double)count/words.length;
			System.out.println(ave*100+"%");
		

	}

}
