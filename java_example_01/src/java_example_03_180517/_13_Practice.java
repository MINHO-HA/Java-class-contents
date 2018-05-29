package java_example_03_180517;

public class _13_Practice {

	public static void main(String[] args) {
		
		int X = 0;
		
		
		
		for (int i=2; i<=10; i += 2) {
			if (i==10) {
				System.out.print(i+ "=");
			} else {
			System.out.print(i+"+");
			X += i;
			} 
		}
		
		System.out.print(X);
	
	}

}
