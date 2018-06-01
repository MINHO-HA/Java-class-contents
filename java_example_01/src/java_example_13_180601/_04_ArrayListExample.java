package java_example_13_180601;

import java.util.ArrayList;
import java.util.List;

//ArrayList 예제
public class _04_ArrayListExample {

	public static void main(String[] args) {
		//ArrayList 선언
		List<String> list = new ArrayList<String>();
		//<> : 제네릭(Generic) (번거로운 타입변환을 제거해주는 역활)
		
		/*
		 * List list = new array();
		 * list.add("홍길동");
		 * Object obj = list.get(0);
		 * String name = (String)obj;
		 */
/*		list.add("홍길동");
		String name = list.get(0);
		System.out.println(name);*/
		
		//리스트객체에 데이터 저장하는 메소드 add()
	 
		
		int size = list.size();
		System.out.println("list의 크기 "+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2번 index에 담긴 데이터 : "+skill);
	
		
		
		//list에 담긴 내용 불러오기
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
			System.out.println();
			
		} 	
		
		System.out.println("--------------");
		//list에 담긴 데이터 삭제
		list.remove(2); //Datebase 삭제함
		list.remove(2); //Servlet/JSP 삭제함
		list.remove("myBatis"); //입력한 문자열이 있는거 지운다~~~~~
		
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
			System.out.println();
			
			
			
		} 	
		
		
		
		
	}
	

}
