package java_example_03_180517;

//char타입을 변수로 하는 switch case문
public class _07_SwitchCharExample {

	public static void main(String[] args) {
		/*char grade = 'f';
		String position = "과장";
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님 입니다.");
		
		}*/
		char grade = 'f';
		String position = "ㅇㅇ";
		
		switch(position) {
		case "부장":
			System.out.println("부장이네");
			break;
		case "과장":
			System.out.println("과장이네");
			break;
		default:
			System.out.println("손님 입니다.");
		
		}

	}

}
