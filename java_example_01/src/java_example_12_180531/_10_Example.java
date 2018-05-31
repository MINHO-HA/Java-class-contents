package java_example_12_180531;

public class _10_Example {

	public static void main(String[] args) {
		
		_09_ImplementationC impl = new _09_ImplementationC();
		impl.methodA();
		impl.methodB();
		impl.methodC();
		_06_InterfaceA ia = impl;
		ia.methodA();
		System.out.println("-----------------------------");
		
		_07_InterfaceB ib = impl;
		ib.methodB();
		System.out.println("-----------------------------");
		
		
		//interfaceC는 AB interface 상속받았기 때문에 세가지 메소드 모두 불러올수 있다.!!!!!
		_08_InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
