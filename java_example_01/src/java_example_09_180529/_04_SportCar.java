package java_example_09_180529;

public class _04_SportCar extends _03_Car{
	
	@Override
	public void colorSelect() {
		System.out.println("네이비 선택");
	}
	
	/*@Override
	public void colorChange() {
		System.out.println("그레이로 변경");
	}*/
	
	//부모클래스에서 final 매소드 상속과 재정의가 불가능하네!!!!!!
}
