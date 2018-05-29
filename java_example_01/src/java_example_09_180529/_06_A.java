package java_example_09_180529;

public class _06_A {
	
	protected String name;
	/*protected int class;*/
	protected int num;
	
	protected _06_A(String name, int num) {
		this.name=name;
		this.num=num;
	}
	
	protected void greeting() {
		System.out.println("안녕~ 나는"+ this.name+"이고 " +this.num+"반 이야:)");
	}
	/*
	 * A class
	 * 접근제한자가 protected인 필드, 생성자, 메소드 선언
	 * 
	 * B class
	 * 메소드를 선언해서 
	 * a클래스 객체 만들고 a클래스의 필드, 메소드에 접근 가능한지 확인
	 * 
	 * C class
	 * 다른 패키지에 선언하고
	 * a클래스 포함시키고
	 * a클래스 객체 만들고 a클래스의 필드, 메소드에 접근 가능한지 확인
	 * 
	 * D class
	 * c클래스와 동일한 패키지에 선언 후 
	 * a클래스 포함시키고 a클래스 상속받고
	 * 생성자를 선언해서 부모클래스의 필드와 메소드에 접근 가능한지 확인
	 */
}
