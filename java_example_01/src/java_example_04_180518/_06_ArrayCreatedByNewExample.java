package java_example_04_180518;

public class _06_ArrayCreatedByNewExample {

	public static void main(String[] args) {
		//int scores [];
		int scores [] = new int[8]; // 총 5개의 값을 담을 수 있는 배열 변수 scores 선언
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " +arr2[i]);
		}
		String[] arr3 = new String[3]; //선언먼저
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " +arr3[i]);
		}
		
		int length=scores.length;
		int sum = 0;
		System.out.println("배열길이 length 변수 값 : " + length);
		sum = sum + length;
		System.out.println(sum);
		double avg = sum/scores.length;
		System.out.println();
		
		for(int i=0; i<scores.length; i++) {
			sum = sum+scores[i];
		}
		double avge = sum/scores.length;
		System.out.println(avge);
		
		
		
		
		
	}

}
