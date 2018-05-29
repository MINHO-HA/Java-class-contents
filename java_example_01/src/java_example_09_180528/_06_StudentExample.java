package java_example_09_180528;

public class _06_StudentExample {

	public static void main(String[] args) {
		//Student 클레스에 대한 객체 생성
		_05_Student student = new _05_Student("하민호", "911118-1111111", 1);
		
		//부모클래스의 필드
		System.out.println(student.name);
		System.out.println(student.ssn);
		
		//자식클래스의 필드
		System.out.println(student.studentNo);
	}

}
