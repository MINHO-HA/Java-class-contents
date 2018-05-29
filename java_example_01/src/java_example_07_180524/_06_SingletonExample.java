package java_example_07_180524;

public class _06_SingletonExample {

	public static void main(String[] args) {
		//일반적인 객체 생성하는 방식
		//_05_Singleton obj2 = new _05_Singleton();
	
		
		
		//싱글톤으로 선언한 클래스를 사용하는 방식
		_05_Singleton obj1 = _05_Singleton.getInstance();

	}

}
