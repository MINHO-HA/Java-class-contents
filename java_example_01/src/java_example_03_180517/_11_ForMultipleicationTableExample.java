package java_example_03_180517;

//중첩 for문을 이용한 구구단 출력하기
public class _11_ForMultipleicationTableExample {

	public static void main(String[] args) {
		
	for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.print( i + "X" + j + "=" +  (i*j));
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
