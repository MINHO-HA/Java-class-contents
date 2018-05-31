package java_example_12_180531;

import java.text.SimpleDateFormat;
import java.util.Date;

//Date 클래스 예제
public class _33_DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now); //Date타입의 now~~~
		String strNow = now.toString();
		System.out.println(strNow); //String타입의 strNow~~~~ 쓰기에 스트링 타입이 더 편하다~~~~~!!!!
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //한국어로 표현하고 싶을때~~~~
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		
		
	}

}
