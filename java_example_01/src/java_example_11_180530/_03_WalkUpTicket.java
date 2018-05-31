package java_example_11_180530;

public class _03_WalkUpTicket extends _01_Ticket {

	_03_WalkUpTicket(String ticketNum) {
		super(ticketNum);
	}
	
	public void buy() {

			System.out.println("일반예약시 티켓넘버는 "+ticketNum);
			System.out.print("현장에서 카드 결제시 가격은 ");
			int p1=(int) ((price*0.05)+price);
			System.out.println(p1+"원");

			System.out.print("현장에서 현금 결제시 가격은 ");
			int p2=price;
			System.out.println(p2+"원");
		
		
	}
	

	
}
