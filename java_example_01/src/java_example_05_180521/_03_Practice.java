package java_example_05_180521;

public class _03_Practice {

	public static void main(String[] args) {
		/*
		 * 2차원 배열을 사용하여 평점 계산하기
		 */
		double score[][]= {
				{3.3, 3.4},
				{3.5, 3.8},
				{4.2, 4.3},
				{3.9, 4.0}
		};
		
		double sum=0;
		double ave=0;
		int count=0;
		//score.length : score 배열의 행의 길이 = (4)
		//score[0].length : score 배열의 1행의 열길이 = (2)
		for(int i=0; i<score.length; i++)
			for(int j=0; j<score[i].length; j++) {
				count++;
				sum=sum+score[i][j];
				ave=sum/count;
				System.out.println(score[i][j]);
			}
		System.out.println("\n총점 : "+sum);
		System.out.println("\n평점 : "+ave);
							
							
	}

}
