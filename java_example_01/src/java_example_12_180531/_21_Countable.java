package java_example_12_180531;

public abstract class _21_Countable {

	protected String name;
	protected int num;
	
	_21_Countable(String name, int num){
		this.name=name;
		this.num=num;
	}
	
	
	abstract void count();
}
