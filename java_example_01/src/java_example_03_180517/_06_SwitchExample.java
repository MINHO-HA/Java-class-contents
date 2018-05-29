package java_example_03_180517;

public class _06_SwitchExample {

	public static void main(String[] args) {
		
		int zzz = (int)(Math.random()*6)+1;
		String  C;
		
		switch(zzz) {
					case 1: //num==1 인 경우
						C = "1";
						break;
					case 2: //num==2 인 경우
						C = "2";
						break;
					case 3: //num==3 인 경우
						C = "3";
						break;
					case 4: //num==4 인 경우
						C = "4";
						break;
					case 5: //num==5 인 경우
						C = "5";
						break;
					default:
						C = "6";
						break;
					}
		System.out.println(C + "번이네");

	}

}
