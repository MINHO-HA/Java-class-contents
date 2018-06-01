package java_example_13_180601;

import java.util.*;


public class _09_Practice {

	public static void main(String[] args) {
		//문자열 저장이 가능한 Arraylist 선언~~~~
		List<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		int max=0;
		String h=null;
		
		
		//리스트에 5명의 사람이름 입력하기~~~~~
		System.out.println("제일 긴 이름 출력하기 게임~~\n5명의 이름을 차례대로 입력해봐~~");
		for(int i=1;i<=5;i++) {
			list.add(scan.next());
		}
		
		
		
		for(int i=0;i<=4;i++) {
			int x = list.get(i).length();	
			//입력된 사람들의 이름 출력하기~~~~
			System.out.println(i+1+"번 : "+list.get(i)+"["+x+"]"); 
				if(x>max) {
					max=x;
					if(list.get(i).length()==max) {
						h = list.get(i);
					}
				}
		}	System.out.println("가장 긴 이름은 :"+h+"["+max+"]");
		
		
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("선생님 풀이");
		//입력된 이름 중 가장 긴 이름 출력하기
		int longname = 0;
		for(int i=1; i<list.size();i++) {
			if(list.get(longname).length()<list.get(i).length()) {
				longname=i;
			}
		}
		System.out.println(list.get(longname));
		
	
	}

}
