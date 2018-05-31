package java_example_11_180530;
//인터페이스 RemoteControl의 구현클래스
public class _23_Television implements _22_RemoteControl {
	
	//필드 선언
	private int volume;

	/*@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}*/
	
	//인터페이스에서 선언한 turnOn 실체 메소드 선언
	
	@Override
	public void turnOn() {
		System.out.println("TV 킴");
	}
	@Override
	public void turnOff() {
		System.out.println("TV 끔");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>_22_RemoteControl.MAX_VOLUME) {
			this.volume = _22_RemoteControl.MAX_VOLUME;
		} else if(volume<_22_RemoteControl.MIN_VOLUME) {
			this.volume = _22_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+volume);
	}
	
}
