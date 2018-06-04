package java_example_13_180601;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//Map 예제
public class _08_MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("손흥민", 183);
		map.put("기성용", 191);
		map.put("박지성", 176);
		map.put("손흥민", 168);
		map.put("구자철", 183);
		
		System.out.println("Map에 저장된 데이터 수 : "+map.size());
		
		//특정 데이터 찾기 >>키값(저기서 이름) 적어주면 키값에 해당하는 벨류(저기서 신장)값 나옴
		System.out.println(map.get("손흥민"));
		System.out.println();
		
		Set<String> keySet = map.keySet();  //키값만 따로 뽑아서 keySet 에 담기
		Iterator<String> keyIterator = keySet.iterator(); 
		while(keyIterator.hasNext()) {
			
			String key = keyIterator.next();
			
			System.out.println(key);
		}

	}

}
