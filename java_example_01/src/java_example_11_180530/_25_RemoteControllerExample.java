package java_example_11_180530;

public class _25_RemoteControllerExample {

	public static void main(String[] args) {
		//인터페이스 타입 변수 선언
		//각각 객체를 인터페이스 타입 변수에 대입
		
		//인터페이스 객체만들수없다 그래서>>>> _22_RemoteControl rc = new _22_RemoteControl; 안된다!!!!!!!!!!!!!!!!!!!!!!!!!
		
		//Televison 객체를 rc에 대입 
		//따라서 rc는 Televison 객체가 됨.....
		/*_22_RemoteControl rc;
		rc = new _23_Television();*/
		
		_22_RemoteControl rc = new _23_Television(); ///1
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false); //클래스 상속받은 개념처럼 리모트컨트롤에 정의되어있는 셋뮤트 메소드가 나온다~~~
		rc.setMute(true);
		
		
		//Audio 객체를 rc에 대입 
		//따라서 rc는 Audio 객체가 됨.....
		rc = new _24_Audio(); ////1
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false); //오디오클래스에서 재정의한 셋뮤트 메소드가 나온다~~~
		_22_RemoteControl.changeBattery();
		
		/*	int a = 0;
			int a = 1;*/
		//위에꺼 생각해서 1번체크한거 생각하자!!!!
	}

}
