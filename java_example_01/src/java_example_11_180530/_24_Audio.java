package java_example_11_180530;

public class _24_Audio implements _22_RemoteControl {

	int volume;
	boolean mute;
	
	public void turnOn() {
		System.out.println("Audio 킴");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio 끔");
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
		System.out.println("현재 Audio 볼륨 : "+volume);
	}
	
	
	
	//인터페이스에서 정의한 디폴트 메소드를 재정의할때
	//접근제한자를 default 에서 public 으로 
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio를 무음처리 한다.");
		} else {
			System.out.println("Audio를 무음해제 한다.");
		}
	}
	
}
