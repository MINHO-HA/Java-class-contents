package java_example_10_180529;

public class _16_Truck extends _14_Car {
	
	public String limitedLoadSpace;
	
	_16_Truck(String color, int speed) {
		super(color, speed);
	}

	public void limitedLoadSpace(String limitedLoadSpace) {
		this.limitedLoadSpace=limitedLoadSpace;
	}

}
