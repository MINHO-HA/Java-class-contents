package java_example_11_180530;

public class _01_Ticket {

	public String ticketNum;
	public int price=100000;
	
	_01_Ticket(String ticketNum){
		this.ticketNum=ticketNum;

	}
	
	
	
	static void conditions () {
		System.out.println("################  티켓가격 안내   #######################");
		System.out.println("||일반 예약시 티켓가격은 정가이며 카드결제시 5%의 금액이 가산됩니다.||");
		System.out.println("||또한 사전예약 행사로 인해                                                             ||");
		System.out.println("||30일 이전 결제시 정가의 50%                            ||");
		System.out.println("||10일 이전 결제시 정가의 20%                            ||");
		System.out.println("||5일 이전 결제시 정가의 10%를 할인해 드립니다.               ||");
		System.out.println("####################################################");
		System.out.println();
		System.out.println();
	}
	
	public void buy() {
		System.out.println(this.ticketNum);
		System.out.println(this.price);
	}
	
	
}
