package java_example_12_180531;

public class _13_Tank implements _11_Car, _12_Cannon{

	

	@Override
	public void work() {

		System.out.println("탱크가 앞으로 전진~~~~~~~~~~~~~~~~~");
	}
	
	
	@Override
	public void fire() {
		
		System.out.println("탱크가 대포를 발사~~~~~~~~~~~~~~~~~");
	}

	
}
