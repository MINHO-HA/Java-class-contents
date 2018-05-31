package java_example_12_180531;

public class _20_Main {

	public static void main(String[] args) {

		//첫번째 계산기 기능
		_19_smartPhone smp = new _19_smartPhone();

		System.out.println(smp.plus(1000, 20));
		
		
		//스마트폰 기능
	
		
		//전화걸기, 받기기능
		smp.answeringPhone();
		smp.callingPhone();
		
		//음악재생, 정지기능
		smp.pausingMusic();
		smp.playingMusic();
		
		//문자 수신, 발신기능
		smp.receivingMessage();
		smp.sendingMessage();

	}

}
