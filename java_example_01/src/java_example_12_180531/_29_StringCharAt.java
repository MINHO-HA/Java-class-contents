package java_example_12_180531;

public class _29_StringCharAt {

	public static void main(String[] args) {
		//charAt() 메소드
		
		String ssn = "180531-456789";
		char gender = ssn.charAt(7); //가로안에 숫자는 >>>>> string index번호 (0부터시작)
		switch(gender) {
		case '1' :
			System.out.println("남자입니다.");
			break;
		case '2' :
			System.out.println("여자입니다.");
			break;
		case '3' :
			System.out.println("남자입니다.");
			break;
		case '4' :
			System.out.println("여자입니다.");
			break;
		}

	}

}
