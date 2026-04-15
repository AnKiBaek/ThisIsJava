package practice5_8.sec12;

import java.util.Calendar;

public class WeekExample {
	
	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar now = Calendar.getInstance();
		
		today = Week.SATERDAY;
		
		int day = now.get(Calendar.DAY_OF_WEEK);
		
//		switch(day) {
//		case 1 : today = Week.SUNDAY; break;
//		case 2 : today = Week.MONDAY; break;
//		case 3 : today = Week.TUSEDAY; break;
//		case 4 : today = Week.WENEDAY; break;
//		case 5 : today = Week.THURSDAY; break;
//		case 6 : today = Week.FRIDAY; break;
//		case 7 : today = Week.SATERDAY; break;
//		
//		}
		
		
//		편의상 today 를 바로출렸했지만 today또한 조건으로써 활용해서 최종적으로는 상수대신
		// 출력물을 따로 만들어 상수노출을 피하는것이 좋다.
		System.out.println(today);
		
	}

}
