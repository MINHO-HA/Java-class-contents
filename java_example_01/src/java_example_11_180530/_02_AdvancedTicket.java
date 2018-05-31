package java_example_11_180530;

public class _02_AdvancedTicket extends _01_Ticket {
	
	_02_AdvancedTicket(String ticketNum) {
		super(ticketNum);
	}
	
	@Override
	public void buy() {
			System.out.println("사전예약시 티켓넘버는 "+ticketNum);
			System.out.print("30일 이전 결제시 가격은 ");
			int p30=(int) (price*0.5);
			System.out.println(p30+"원");
	
			System.out.print("20일 이전 결제시 가격은 ");
			int p20=(int) (price*0.8);
			System.out.println(p20+"원");
		
			System.out.print("10일 이전 결제시 가격은 ");
			int p10=(int)(price*0.9);
			System.out.println(p10+"원");
		

		
	}

	
	
}
