package java_example_13_180601;

import java.util.*;

public class _07_HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("myBatis");
		set.add("Java"); //0번 인덱스와 똑같은 문자열~~ 똑같은게 들어오면 무시해서 데이터수는 중복된거 제외한 값이 나온다
		
		int size = set.size();
		System.out.println("set에 담긴 총 데이터 수 : "+size);
		
		
		//Set에 들어있는 모든 데이터 가져오기
		//반복자 (Iterator) 사용
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		System.out.println("-----");
		set.remove("JDBC"); //삭제하는 메소드
		set.remove("Java");
		Iterator<String> iterator1 = set.iterator();
		while(iterator1.hasNext()) {
			String element = iterator1.next();
			System.out.println(element);
		}
		
		System.out.println();
		
		//set에 있는 내용을 전체삭제
		set.clear();
		
		set.isEmpty();
			
		Iterator<String> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			String element = iterator2.next();
			System.out.println(element);
		}
			
			
			
			
	}

}
