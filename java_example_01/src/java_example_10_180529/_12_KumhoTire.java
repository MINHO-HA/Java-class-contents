package java_example_10_180529;

public class _12_KumhoTire extends _09_Tire {

	//필드
	//생성자
	public _12_KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
		@Override
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation<maxRotation) {
				
				System.out.println(location + "KumhoTire 수명 :"+
						(maxRotation-accumulatedRotation)+"회");
				return true;
				
			} else {
				
				System.out.println("***" + location + "KumhoTire 펑크 ***");
				return false;
				
			}
		}
			
		
	
}
	
	

