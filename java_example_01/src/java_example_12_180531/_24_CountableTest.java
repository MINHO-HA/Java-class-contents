package java_example_12_180531;

public class _24_CountableTest {

	public static void main(String[] args) {

	
		/*_22_Bird bird1 = new _22_Bird("독수리");
		_23_Tree tree = new _23_Tree("사과나무");
		_23_Tree tree1 = new _23_Tree("밤나무");
		bird = (_21_Countable) _22_Bird;*/
		
		
		
		
		//강제형변환!!!!!!!!!!!!!!!!!!!!
		/*double a =2.0;
		int b = (int)a;*/
		//강제형변환!!!!!!!!!!!!!!!!!!!!
	
		
		
		
		_21_Countable[] array = { 	
									new _22_Bird("뻐꾸기", 10), 
									new _22_Bird("독수리", 30),
									new _23_Tree("사과나무", 50), 
									new _23_Tree("밤나무", 100) 
		};
	
								/*
								 * array[0]=new Bird("뻐꾸기")
								 * array[1]=new Bird("독수리")
								 * array[2]=new Bird("사과나무")
								 * array[3]=new Bird("밤나무")
								 */ 
					//하나의 변수에 여러타입을 넣을수있는것>>다형성!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
								
		
		for (_21_Countable countable : array)
			
			/*
			 * 첫번째 반복문 실행
			 * countable=array[0]
			 *          =new Bird("뻐꾸기")
			 * 뻐꾸기를 매개변수로 하는 Bird의 객체를 생성해서 countable에 대입
			 * 
			 * 두번째 반복문 실행
			 * countable=array[1]
			 * 			=new Bird("독수리")
			 * 독수리를 매개변수로 하는 Bird의 객체를 생성해서 countable에 대입
			 * ................................
			 *
			 */
			countable.count();	//뻐꾸기가 2마리 있다.
								//독수리가 2마리 있다.............
			
		System.out.println("----------------------------");
		
	
				//타입에 따라 fly() 또는 ripen() 메서드를 호출하는
		
				/*
				 * 출력문
				 * 
				 * 2마리 뻐꾸기가 날아간다.
				 * 2마리 독수리가 날아간다.
				 * 
				 * 사과나무에 열매가 잘 익었다.
				 * 밤나무에 열매가 잘 익었다.
				 * 
				 */

		
		
		
		///다시봐야된다~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		for(int i=0; i<array.length; i++) {
			//타입에 따라 fly() 또는 ripen() 메서드를 호출 >>instanceof 사용~~
			//조건문을 이용해서 배열에 저장된 각 요소가 Bird클래스 타입인지 확인~~~~~
			if(array[i] instanceof _22_Bird ) {
				((_22_Bird)array[i]).fly();
			} else {
				((_23_Tree)array[i]).ripen();
			}
			
		
		}
		

		double a = 2;
		System.out.println((int)a);
		a = (int)a;
		System.out.println(a);
	}
}


