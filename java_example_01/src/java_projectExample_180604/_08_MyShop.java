package java_projectExample_180604;

import java.util.*;

//IShop 인터페이스의 구현 클래스
public class _08_MyShop implements _01_IShop {

	//회원 정보 등록을 위한 배열 선언
	_03_User[] users = new _03_User[2];
	
	//상품 정보 등록을 위한 배열 선언
	_02_Product[] products = new _02_Product[4];
	
	//상품 추가를 위한 장바구니
	ArrayList<_02_Product> cart = new ArrayList<_02_Product>();
	
	Scanner scan = new Scanner(System.in);
	
	int selUser;
	
	String title;
	
	
	@Override
	public void setTitle(String title) {
		this.title=title;
		
	}

	@Override
	public void genUser() {
		//내가 작성한것... 뭐가 잘못됬는지 확인해보자잉~
		//배열에 내용 담는거 기억하자!!!!!
		/*_03_User user = new _03_User("홍길동", null);
		System.out.println("[0]"+user.getName()+user.getPayType());
		
		_03_User user2 = new _03_User("블로거", null);
		System.out.println("[1]"+user.getName()+user.getPayType());*/
		
		_03_User user = new _03_User("손흥민", _04_payType.CARD);
		users[0] = user;
		
		user = new _03_User("기성용", _04_payType.CASH);
		users[1] = user;
		
	}

	@Override
	public void genProduct() {
		//내가 작성한것... 뭐가 잘못됬는지 확인해보자잉~
		//배열에 내용 담는거 기억하자!!!!!
		/*_05_Cellphone cp = new _05_Cellphone("갤럭시S9", 1000000, "SKT");
		cp.printDetail();
		
		_05_Cellphone cp2 = new _05_Cellphone("애플 아이폰X", 980000, "KT");
		cp2.printDetail();*/
		
		_05_Cellphone cp = new _05_Cellphone("갤럭시S9", 1000000, "SKT");
		products[0] = cp;
		
		cp = new _05_Cellphone("아이폰X", 1200000, "KT");
		products[1] = cp;
		
		cp = new _05_Cellphone("샤오미노트", 500000, "LG");
		products[2] = cp;
	}

	@Override
	public void start() {
		
		System.out.println(title+ ": 메인화면 - 사용자 선택");
		System.out.println("---------------------------");
		int i=0;
		
		for(_03_User u : users) {
			
			System.out.println("["+(i++)+"]"+u.getName()+u.getPayType());
		}
		System.out.println("[x] 종료");
		System.out.println("선택 : ");
		String sel = scan.next();
		System.out.println("## "+sel +"선택##");
		
		switch(sel) {
			case "x" : System.exit(0);
					break;
					
			default : 
				selUser = Integer.parseInt(sel);
				/*문제발생한곳*/productList();
		}
		
		/*for(int i=0;i<users.length;i++) {
			System.out.println("["+i+"]"+users[i].getName()+users[i].getPayType());
		
		System.out.println("선택 : ");
		int bt = scan.nextInt();
		
		if (bt == i)
			System.out.println("["+bt+"]"+users[bt].getName()+users[bt].getPayType());
		} else {
			System.out.println("종료");
		}*/
		
		
	}

	public void productList() {
		
		System.out.println(title+ ": 상품목록  - 상품 선택");
		System.out.println("---------------------------");
		int i=0;
		
		for(_02_Product p: products) {
			System.out.println("["+i+"]");
			/*문제발생한곳*/p.printDetail();
			i++;
		}
		
		
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.println("선택 : ");
		String sel = scan.next();
		System.out.println("## "+sel+"선택 ##");
		
		switch(sel) {
		case "h" : 
			start();
			break;
		
		case "c" : 
			checkOut();
			break;
		default : 
			int psel = Integer.parseInt(sel);
			cart.add(products[psel]);
			productList();
			
		}
			
		
		/*for(int i=0; i<products.length; i++) {
			System.out.println("["+i+"]"+"상품명 : "+products[i].pName+products[i].price);
		
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		
		int selectNum = scan.nextInt();
		
		if(selectNum == i) {
			cart = products[i];
		}
		
		checkOut();
		}*/
	}
	
	public void checkOut() {
			System.out.println(title+ " :체크아웃");
			System.out.println("======================");
			int total=0;
			int i=0;
			
			//장바구니에 담긴 상품 정보 출력
			for(_02_Product p : cart) {
				System.out.println("["+(i++)+"]"+p.pName+p.price);
				total = total +p.price;
			}
			
			System.out.println("========================");
			
			System.out.println("결제방법 : "+users[selUser].getPayType());
			
			System.out.println("합계 : "+total+"원 입니다.");

			System.out.println("[p]이전, [q]결제완료");
			
			String sel = scan.next();
			
			switch(sel) {
			case "p" : 
				productList();
				break;
			case "q" :
				System.out.println("결제완료");
				System.exit(0);
				break;
				
			default :
				checkOut();
			
			}
	}
	
	

}
