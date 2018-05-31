package java_example_11_180530;

public class _17_AnimalExample {

	public static void main(String[] args) {
		_16_Dog dog = new _16_Dog();
		
		_17_Cat cat = new _17_Cat();
		
		dog.sound();
		cat.sound();
		dog.breathe();
		cat.breathe();
		_15_Animal.breathe();
		System.out.println("-----------");
		
	}

}
