package java_example_10_180529;

public class _14_Car {

	public String color;
	public int speed;
	
	_14_Car(String color, int speed){
		this.color=color;
		this.speed=speed;
	}
	
	
	public void increaseSpeed (int speed) {
		this.speed+=speed;
	}
	
	public void decreaseSpeed (int speed) {
		this.speed-=speed;
	}
}
