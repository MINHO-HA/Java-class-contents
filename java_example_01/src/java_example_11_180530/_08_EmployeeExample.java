package java_example_11_180530;

public class _08_EmployeeExample {

	public static void main(String[] args) {

		_06_Manager m = new _06_Manager("Messi", 3000000, 500000);
		_07_Executive e = new _07_Executive("Ronaldo", 5000000, 1000000, 100);

		m.employee1();
		e.employee1();
		System.out.println();
		System.out.println("급여인상률에 따라");
		
		m.increasedWage();
		e.increasedWage();
		
	}

}
