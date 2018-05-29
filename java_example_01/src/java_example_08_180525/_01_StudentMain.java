package java_example_08_180525;

import java.util.Scanner;

public class _01_StudentMain {

	public String studentName;
	public int koreanScore;
	public int englishScore;
	public int mathScore;
	Scanner scan = new Scanner(System.in);
	
	
	public void _01_studentMain() {
		this.studentName=scan.next();
		this.koreanScore=scan.nextInt();
		this.englishScore=scan.nextInt();
		this.mathScore=scan.nextInt();
	}
	
	
	public int aa() {
		int x = this.koreanScore;
 		int y = this.englishScore;
 		int z = this.mathScore;
 		int sum = x+y+z;
 		double avg = sum/3;
 		int g = 0;
 		
 		for(int i=0;i<avg;i+=avg) {
 			for(int j=i+1;j<avg;j+=avg) {
 				if(i<j) {
 					g=j;
 					j=i;
 					i=g;
 				} 
 					
 			} 
 		}
 		
 		return g;
	
	}
	public void dd() {
		System.out.println(scan.next());
	}
	
	
	
	
}
