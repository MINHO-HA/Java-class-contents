package java_example_06_180523;
//KoreanExample 클래스
public class _08_KoreanExample {

	public static void main(String[] args) {
		
		//본인의 이름과 주민번호 앞자리로 k1, k2객체를 각각 생성해서 필드값을 출력해보세요.
		
		//객체생성
		_07_Korean k1 = new _07_Korean("대한민국","하민호", "911118");
		
		//필드값 출력
		System.out.println(k1.nation);
		System.out.println(k1.n);
		System.out.println(k1.ssn);
		
		_07_Korean k2 = new _07_Korean("미국","하승호", "921210");
		
		//필드값 출력
		System.out.println(k2.nation);
		System.out.println(k2.n);
		System.out.println(k2.ssn);
		
		
	}

}
