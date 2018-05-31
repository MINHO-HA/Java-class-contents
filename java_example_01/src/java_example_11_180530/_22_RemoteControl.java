package java_example_11_180530;

public interface _22_RemoteControl {

	//상수 선언만 가능 (인터페이스에서)
	public final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드 선언
	//abstract를 붙이지 않아도 자동으로 추상메소드로 인식~~~~~~~~~~~~~
	//사용 목적은 객체가 가지고 있는 메소드에 대한 설명~~~~~~~~~
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴드 메소드
	//구현 객체가 가지고 있는 메소드의 실행내용까지 작성해 놓은것.......
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리 한다.");
		} else {
			System.out.println("무음해제 한다.");
		}
	}
	
	//정적(static) 메소드
	//객체가 없어도 인터페이스에서 바로 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("건전기 교환");
	}
}
