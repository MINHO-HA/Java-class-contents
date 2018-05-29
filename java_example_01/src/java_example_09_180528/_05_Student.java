package java_example_09_180528;

public class _05_Student extends _04_People {
		//클래스 추가
		//Student 자식 클래스
		//studentNo 필드
		//name, ssn, studentNo 매개로 하는 생성자
		public int studentNo;
		public _05_Student(String name, String ssn, int studentNo) {
			/*this.name=name;
			this.ssn=ssn;*/
			super(name, ssn); //부모클래스의 해당 매개변수를 이용하는 생성자를 바로 호출.....
			this.studentNo=studentNo;
		}
}
