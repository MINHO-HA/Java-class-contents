package java_example_09_180528;

public class _03_DmbCellphoneExample {

	public static void main(String[] args) {
		//DmbCellphone 객체 생성
		_02_DmbCellphone dmbcellphone = new _02_DmbCellphone("아이폰7", "블랙", 10);
		
		//생성한 객체의 model, color, channel 값을 각각 출력
		System.out.println(dmbcellphone.model);
		System.out.println(dmbcellphone.color);
		System.out.println(dmbcellphone.channel+"\n");
		
		
		//부모 클래스에서 선언한 매소드 각각 호출
		dmbcellphone.powerOn();
		dmbcellphone.powerOff();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("하이");
		dmbcellphone.receiveVoice("웅 하이");
		dmbcellphone.sendVoice("빠이");
		dmbcellphone.receiveVoice("웅 빠이");
		dmbcellphone.hangUp();
		
		
		//자식 클래스에서 선언한 메소드 각각 호출
		System.out.println();
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(100);
		dmbcellphone.turnOffDmb();
		
		
	}

}
