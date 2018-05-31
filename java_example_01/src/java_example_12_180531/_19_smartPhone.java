package java_example_12_180531;

public class _19_smartPhone extends _18_PDA
							implements _16_MobilePhone, _17_MP3 {

	
	
	
	
	
	@Override
	public void answeringPhone() {
		System.out.println("전화받기");
		
	}

	@Override
	public void callingPhone() {
		System.out.println("전화걸기");
		
	}

	@Override
	public void playingMusic() {
		System.out.println("음악재생");
		
	}

	@Override
	public void pausingMusic() {
		System.out.println("음악 일시정지");
		
	}

	@Override
	public void sendingMessage() {
		System.out.println("문자수신");
		
	}

	@Override
	public void receivingMessage() {
		System.out.println("문자발신");
		
	}

	
	
	
}
