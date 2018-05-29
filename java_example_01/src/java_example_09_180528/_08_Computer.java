package java_example_09_180528;
//자식 클래스
public class _08_Computer extends _07_Calculator {
	//부모클래스에서 선언한 areaCicle 메소드를 재정의
	//굳이@Override 안써도 재정의 되지만 실수없애기 위해 
	//쓰게되면 자동으로 찾아서 실수한부분 알려준다!!!!!!!!!!!
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
}
