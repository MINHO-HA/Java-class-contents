package java_example_07_180524;
//싱글톤 예제 p.244
public class _05_Singleton {

	private static _05_Singleton singleton = new _05_Singleton();
	
	private _05_Singleton() {
		
	}
	
	static _05_Singleton getInstance(){
		return singleton;
	}
}
