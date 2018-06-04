package java_projectExample_180604;

public class _05_Cellphone extends _02_Product {

	
	
	String carrier;
	
	
	
	public _05_Cellphone(String name, int price, String carrier) {
		this.pName=pName;
		this.price=price;
		this.carrier=carrier;
	}
		


	/*_05_Cellphone cp = new _05_Cellphone();
	
	cp.pName="갤럭시S9";
	cp.price=1000000;
	cp.printDetail();
	
	
	_05_Cellphone cp2 = new _05_Cellphone();
	
	cp2.pName="아이폰X";
	cp.price=98000;
	cp.printDetail();
	*/

	
	

	
	
	@Override
	public void printExtra() {
		System.out.print("통신사 : "+carrier);
		
	}
	
}