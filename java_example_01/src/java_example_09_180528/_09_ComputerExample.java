package java_example_09_180528;

public class _09_ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		_07_Calculator calculator = new _07_Calculator();
		System.out.println("원면적 : "+calculator.areaCircle(r));
		System.out.println();
		
		
		_08_Computer computer = new _08_Computer();
		System.out.println("원면적 : "+computer.areaCircle(r));

	}

}
