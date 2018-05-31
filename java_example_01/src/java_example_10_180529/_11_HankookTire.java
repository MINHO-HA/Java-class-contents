package java_example_10_180529;

public class _11_HankookTire extends _09_Tire{

	//필드
	//생성자
	public _11_HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			
			System.out.println(location + "HankookTire 수명 :"+
					(maxRotation-accumulatedRotation)+"회");
			return true;
			
		} else {
			
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
			
		}
	}
		
	}

