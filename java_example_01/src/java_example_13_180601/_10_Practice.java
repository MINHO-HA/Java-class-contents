package java_example_13_180601;

import java.util.*;

public class _10_Practice {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);

		map.put("hot", "cold");
		map.put("cheap", "expensive");
		map.put("dark", "bright");
		map.put("easy", "difficult");
		map.put("full", "empty");

		System.out.println("반의어 알려주는 프로그램~");
		Set<String> keySet = map.keySet(); // 키값만 따로 뽑아서 keySet 에 담았다~
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.print(key + " \n");
		}
		System.out.println("다음중 하나의 영단어를 입력해봐~");

		String x = map.get(scan.next());
		if (x.equals(map.get("hot"))) {
			System.out.println("반의어는" + x);
		} else if (x.equals(map.get("cheap"))) {
			System.out.println("반의어는 " + x);
		} else if (x.equals(map.get("cheap"))) {
			System.out.println("반의어는 " + x);
		} else if (x.equals(map.get("dark"))) {
			System.out.println("반의어는 " + x);
		} else if (x.equals(map.get("easy"))) {
			System.out.println("반의어는 " + x);
		} else if (x.equals(map.get("full"))) {
			System.out.println("반의어는 " + x);
		}

	}

}
