package java_example_02_180515;

//대입연산자
/*
 * +=, -=, /=, %=
 * A+=B => A=A+B
 * num1 = num1 + num2
 */
public class _13_AssignmentoperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result=" + result);
		
		result -= 5;
		System.out.println("result=" + result);
		
		result *= 3;
		System.out.println("result=" + result);
		
		result /= 5; 
		System.out.println("result=" + result);
		
		result %= 3;
		System.out.println("result=" + result);

	}

}
