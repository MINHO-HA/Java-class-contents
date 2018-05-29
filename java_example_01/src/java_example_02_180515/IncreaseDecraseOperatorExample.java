package java_example_02_180515;


//증감연산자 예제
/*
 * 변수 앞에 ++이 붙으면 1을 증가시키고 계산에 사용.
 * 변수 뒤에 ++이 붙으면 일단 변수값을 사용하고 1을 증가시켜 놓음.
 */
public class IncreaseDecraseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------");
		x++; // 10 + 1 > 11
		++x; // 11 > 12  >> x가 가지고 있는 값에 1을 더한 후 x에 대입한다.
		System.out.println("x=" + x); // 12
		System.out.println("----------------------");
		y--; // 10 - 1
		--y; // 9 > 8 >> y값을 먼저 사용한 후 1을 감소시켜서 y에 대입한다.
		System.out.println("y=" + y); // 8
		System.out.println("----------------------");
		z = x++; // x가 가지고 있는 값을 z에 대입 후 x 값을 1 증가시킴.
		//z 에 12를 대입하고 x 는 13이 된다...........
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("----------------------");
		z = ++x; // z의 값을 증가시키고 대입힌다.
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("----------------------");
		z = ++x + y++; 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);

	}

}
