package java_example_12_180531;

public class _23_Tree extends _21_Countable {

	_23_Tree (String name, int num){
		super(name, num);
	}
	
	void ripen() {
		System.out.println(name+num+"그루가 열매를 맺음");
	}

	@Override
	void count() {
		System.out.println(name+num+"그루");
		
	
		
		
	}
}
