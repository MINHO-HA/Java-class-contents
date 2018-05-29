package java_example_07_180524;
//상수 선언
public class _07_Earth {

	//상수선언시 static final 무조건   // radius : 반지름
	//따로 생성자 선언 안해도 불러올수있는 객체!!!
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}
