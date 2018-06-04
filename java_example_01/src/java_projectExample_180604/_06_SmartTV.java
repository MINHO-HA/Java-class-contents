package java_projectExample_180604;

public class _06_SmartTV extends _02_Product {

	String resolution;
	
	public _06_SmartTV(String name, int price, String resolution) {
		this.pName=pName;
		this.price=price;
		this.resolution=resolution;
	}
	
	@Override
	public void printExtra() {
		System.out.print("해상도 : "+resolution);
		
	}
	
}
