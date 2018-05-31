package java_example_12_180531;

public class _22_Bird extends _21_Countable {

	_22_Bird (String name, int num){
		super(name, num);
	}
	
	void fly() {
		System.out.println(name+num+"마리가 날아감");
	}

	@Override
	void count() {
		System.out.println(name+num+"마리");
		
	}
}
