package java_example_12_180531;
//p.540
import java.util.Calendar;

public class _34_CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK); //요일은 숫자값으로 출력된다 1=일 / 2=월 / 3=화.....
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year+"년");
		System.out.println(month+"월 : 특이사항은 항상 1을 더해야된다잉~~~~");
		System.out.println(day+"일");
		System.out.println(week+"요일인데 숫자값으로 나온다잉~~ ex)1=일 / 2=월 / 3=화");
		System.out.println(hour+"시");
		System.out.println(minute+"분");
		System.out.println(second+"초");
	}

}
