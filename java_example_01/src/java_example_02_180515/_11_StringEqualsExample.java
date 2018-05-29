package java_example_02_180515;

public class _11_StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "하민호" ;
		String strVar2 = "하민호"	 ;
		String strVar3 = new String("하민호");
		//new 연산자: 새로운 객체를 생성할 때 사용하는 연산자
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals("하민호")); // string 비교시... 이 문법 사용!
		System.out.println(strVar1.equals(strVar3)); // .equals() 문법
	}

}
