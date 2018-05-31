package java_example_11_180530;

public class _06_Manager extends _05_Employee {
	
	int bonus;
	
	_06_Manager(String name, int wage, int bonus){
		super(name, wage);
		this.bonus=bonus;
	}

	@Override
	public void increasedWage() {
		this.wage = (int) (wage*1.20);
		System.out.println("매니저 "+this.name+"의 월급은 "+this.wage+"로 인상된다.");
	}

	public void employee1() {
		System.out.println("매니저 "+this.name+"의 월급은 " +this.wage+ "이며 보너스는 "+this.bonus+"이다.");
	}
	
	
	
}
