package java_example_09_180528;
//Cellphone의 자식클래스인 DmbCellphone
//상속 방법 : "자식클래스명 extends 부모클래스명"
public class _02_DmbCellphone extends _01_Cellphone {
	
	//필드 선언
	int channel;
	
	//생성자 선언
	_02_DmbCellphone(String model, String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//메소드 
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+ channel + "번으로 변경");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신 정지");
	}

	
}
