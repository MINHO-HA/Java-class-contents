package java_example_04_180518;

public class _01_Practice {

	public static void main(String[] args) {
		/*
		 * 문제 : 1+(-2)+3+(-4)+...형태로 더했을 때 얼마까지
		 * 더해야 총 합이 100이상이 되는지 구해보시오.
		 */

		int sum = 0; // 합계용 변수
		int num = 1; // 숫자용 변수
		int count = 1; // 카운트용 변수
		int s = 1; // 부호영 변수
		
		//while문 이용
		/*while(true) {
			sum = sum + num;
			if(sum>=100)
				break;
			count++;
			s=-s;
			num=s*count;
		} System.out.println(count);*/
		
		//for문 이용
		for(count=1; sum<100; count++,s=-s) {
			num=count*s;
			sum=sum+num;
		} System.out.println(num);
		
		
		
		
		
		//>내가푼것
		/*int num = 1;
		int sum = 0;
		int mi = 0;
		int add = 0;
		
		
		while(sum<=100) {
			add++;
			num = num+2;
			mi = mi-2;
			sum = mi+num;
		}	System.out.println(add+1);
			System.out.println(sum);
		*/
		
		/*for (num=1; sum<=100; num=num+2 ) {
				add++;
				mi = mi -2;
				sum = num+mi;
			}
			
			System.out.println(sum);
			System.out.println(add);*/
	}

}
