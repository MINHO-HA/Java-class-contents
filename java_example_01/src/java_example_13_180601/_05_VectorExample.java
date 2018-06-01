package java_example_13_180601;

import java.util.*;

public class _05_VectorExample {

	public static void main(String[] args) {
		
		List<_06_Board> list = new Vector<_06_Board>(); 

		list.add(new _06_Board("제목1", "글내용123", "손흥민"));
		list.add(new _06_Board("제목2", "글내용asd", "호날두"));
		list.add(new _06_Board("제목3", "글내용565", "메시"));
		list.add(new _06_Board("제목4", "글내용fghf", "이승우"));
		list.add(new _06_Board("제목5", "글내용675", "기성용"));
		
		
		/*System.out.println(list.get(0).writer);
		*/
		 
		
		for(int i=0;i<list.size();i++) {
			
			_06_Board board = list.get(i);
			//_06_Board board = new _06_Board("제목1", "글내용123", "손흥민");
			System.out.println(board.subject);
			System.out.println("----");
			System.out.println(board.content);
			System.out.println("----");
			System.out.println(board.writer);
			System.out.println("----");
			/*System.out.println(list.get(i).writer);*/
			
			
			
		}
		
		
		
		
	}

}
