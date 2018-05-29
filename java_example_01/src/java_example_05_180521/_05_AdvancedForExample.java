package java_example_05_180521;


public class _05_AdvancedForExample {

	public static void main(String[] args) {
		/*
		 * 향상된 for문(for-each문)
		 */
		/*int[] scores = {95,85,90,66,88};
		int sum=0;
		//for-each문
		for(int score : scores) {
			sum = sum + score;
			System.out.println(score);
		}
		System.out.println("점수 총합 : "+sum);*/
		
		int[] numbers = {1,2,3,4,5};
		int sum=0;
		for(int number : numbers) {
			sum=sum+number;
			System.out.println(number);
		}
		System.out.println("총합 : "+sum+"\n");
		
		String[] fruits = {"사과","배","바나나","체리","딸기","포도"};
		for(String fruit : fruits) {
			System.out.print(fruit+" ");
		}
		
	}

}
