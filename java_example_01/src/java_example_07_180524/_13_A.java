package java_example_07_180524;

public class _13_A {
	//필드 선언
	public int field1;
	int field2;
	private int field3;
	
	//생성자 선언
	public _13_A() {
		field1=111;
		field2=13;
		field3=1;
		method1();
		method2();
		method3();
	}
	//메소드 선언
	public void method1() {
		for(int i=0;i<4;i++) {
			System.out.println(i+"명");
		}
	}
	void method2() {}
	private void method3() {}	

	
}
