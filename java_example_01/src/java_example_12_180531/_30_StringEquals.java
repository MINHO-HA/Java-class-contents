package java_example_12_180531;

public class _30_StringEquals {

	public static void main(String[] args) {
		String str1 = new String("하민호");
		String str2 = "하민호";
		
		if(str1 == str2 /*동명이인개념~~~~~~~*/) { 
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		} 
		
		if(str1.equals(str2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
	}

}
