package java_example_12_180531;

public class _26_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		int[] array = new int[10];
		

		try {
		System.out.println(array[9]);
		System.out.println(array[10]);
		System.out.println(array[9]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("오류발생했으니 확인해봐~");
		} finally {
			System.out.println("dd");
		}
		
		 //ArrayIndexOutOfBoundsException
	}

}
