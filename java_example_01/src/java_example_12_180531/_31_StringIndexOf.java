package java_example_12_180531;

public class _31_StringIndexOf {

	public static void main(String[] args) {
		//IndexOf() 메소드
		String subject = "자바 프로그래밍ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ";
		System.out.println("----------------------");
		
		int location = subject.indexOf("밍");
		System.out.println("location의 값 : "+location);
		
		int location1 = subject.indexOf("ㅎ");
		System.out.println("location1의 값 : "+location1); //입력된 문자열이 없을때 -1 출력
		
		
		//length() 메소드
		int length = subject.length();
		System.out.println("length의 값 : "+length); //띄어쓰기도 문자열로 포함한다.. 갯수 카운트함~~~~~
		System.out.println("----------------------");
		
		//replace() 메소드
		String newStr = subject.replace("자바", "재미있는!!!"); //바꾸고싶은 문자와 바꿀 문자를 입력하고 출력하면 바뀌어서 나온다~~~~~
		System.out.println(newStr);
		System.out.println("----------------------");
		
		//subString() 메소드
		String ssn = "180531-345678";
		String firstNum = ssn.substring(3, 8); //처음번호 = 시작번호 ,,,,,,, 두번째번호 = 마지막 번호 ,,,,,,,시작번호에서 마지막번호 인덱스번호 문자열 출력
		String secondNum = ssn.substring(3); //가로안의 숫자 인덱스 값부터 끝가지 출력
		System.out.println("firstNum의 값 : "+firstNum);
		System.out.println("secondNum의 값 : "+secondNum);
		System.out.println("----------------------");
		
		//toLowerCase(), toUpperCase() 메소드
		String str3 = "ABcdEfGHijkLmnoPQrStuVwxyz";
		String str3Lower = str3.toLowerCase(); //소문자 출력
 		String str3Upper = str3.toUpperCase(); //대문자 출력
		System.out.println("str3Lower의 값 : "+str3Lower);
		System.out.println("str3Upper의 값 : "+str3Upper);
		System.out.println("----------------------");
	
		//trim() 메소드
		String tel1 = "     02";
		String tel2 = "1234     ";
		String tel3 = "   55555    ";
		String tel4 = "12323 123123 2342423 333   ";
		String tel5 = "SDFDS SDFDS DSDS";
		
		
		String tel= tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
		System.out.println("----------------------");
		String tel6 = tel4.trim()+tel5.trim();
		System.out.println(tel6);
		
		
		
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이구먼");
		} else {
			System.out.println("자바와 관련된 책이 아니구먼");
		}

	}

}
