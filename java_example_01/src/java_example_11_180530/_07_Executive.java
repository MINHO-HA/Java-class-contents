package java_example_11_180530;

public class _07_Executive extends _06_Manager {
	
	int stock;
	
	_07_Executive(String name, int wage, int bonus, int stock){
		super(name, wage, bonus);
		this.stock=stock;
	}
	
	@Override
	public void increasedWage() {
		this.wage = (int) (wage*1.30);
		System.out.println("경영진 "+this.name+"의 월급은 "+this.wage+"로 인상된다.");
	}
	
	public void employee1() {
		System.out.println("경영진 "+this.name+"의 월급은 " +this.wage+ "이며 보너스는 "+this.bonus+"이고 스톡옵션은"+this.stock+"주 이다.");
	}

}
