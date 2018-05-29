package java_example_07_180524;

public class _18_PracticeExample {

	private String name;
	private int assignmentScore;
	private int examScore;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAssignmentScore() {
		return assignmentScore;
	}

	public void setAssignmentScore(int assignmentScore) {
		this.assignmentScore = assignmentScore;
	}

	public int getExamScore() {
		return examScore;
	}

	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}

	_18_PracticeExample(){
		
	}
	
	/*void result() {
		System.out.println("이름 : "+this.name);
		System.out.println("과제 점수 : "+this.assignmentScore);
		System.out.println("시험 점수 : "+this.examScore);
		if((assignmentScore+examScore)/2>=90) {
			System.out.println("학점 : A"+"\n");
		} else {
			System.out.println("학점 : B"+"\n");
		}
	}*/
	
	public char grade() { //char (한글자 선언할때 char로 사용~~~~)
		if((this.examScore+this.assignmentScore)/2>=90) {
			return 'A';
		} else {
			return 'B';
		}	
	}
		
	void result() {
		System.out.println("이름 : "+getName());
		System.out.println("과제 점수 : "+getAssignmentScore());
		System.out.println("시험 점수 : "+getExamScore());
		System.out.println("학점 : "+grade()+"\n");
	}
	
		
	
		

}
