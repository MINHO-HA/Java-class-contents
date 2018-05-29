package java_example_06_180523;
//method overloading p.232
public class _17_Calculator {
	
	//정사각형의 넓이를 구하는 메소드
	//메소드 이름 : areaRectangle
	//직사각형의 넓이를 구하는 메소드
	int width = 2000;
/*	int width = 200;*/
/*	_17_Calculator(){
		
	}*/
	
	double areaRectangle (int width) {
		int result = width*this.width;
		return result;
	}
	
	double areaRectangle (int width, int height) {
		int result = this.width*height;
		return result;
	}
	
}



//main 클래스의 실행 내용
/*
* 객체 생성해서
* 정사각형 넓이 구하는 메소드 호출하고 결과 출력
* 직사각형 넓이 구하는 메소드 호출하고 결과 출력
*/