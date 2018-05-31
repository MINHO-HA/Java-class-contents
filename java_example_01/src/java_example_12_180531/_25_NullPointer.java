package java_example_12_180531;

public class _25_NullPointer {

	public static void main(String[] args) {
		
		try {
		String data = null;
		System.out.println("예외발생전..........");
		System.out.println(data.toString()); //변환할것이 없기에 오류가 발생~~~
		System.out.println("예외발생후.........");
		System.out.println(data);
		} catch(NullPointerException e) {
			System.out.println("예외를 발생했으니 코드를 확인해 볼 것");
			System.out.println(e);
		} finally {
			System.out.println("dd");
		}
	}

}
