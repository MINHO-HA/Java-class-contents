package java_example_08_180525;

public class _06_Practice {

	double x;
	double y;
	double x2;
	double y2;
	double h;
	
	_06_Practice(){
		
	}
	
	public void calculator(double x, double y, double x2, double y2) {
		this.x=x;
		this.y=y;
		this.x2=x2;
		this.y2=y2;
		this.h=Math.sqrt( ((x-x2)*(x-x2))+((y-y2)*(y-y2)) );
		System.out.println(this.h);

	}
}
