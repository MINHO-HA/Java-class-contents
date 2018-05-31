package java_example_11_180530;

public class _05_Employee {

	public String name;
	public int wage;
	
	_05_Employee(String name, int wage){
		this.name=name;
		this.wage=wage;
	}
	
	

	public void increasedWage() {
		this.wage = (int) (wage*1.10);
		System.out.println(this.wage);
	}
}
