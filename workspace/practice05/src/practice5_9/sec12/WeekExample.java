package practice5_9.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		
		
		Week today = null;
		
		Calendar now = Calendar.getInstance();
		
		int day = now.get(Calendar.DAY_OF_WEEK);
		
		switch(day) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.MONDAY; break;
		case 3 : today = Week.TUSEDAY; break;
		case 4 : today = Week.WENEDAY; break;
		case 5 : today = Week.THURSDAY; break;
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATERDAY; break;
		
		}
		
		
		if(day == 1) {
			System.out.println("오늘은 일요일");
		} else if(day == 2) {
			System.out.println("오늘은 월요일");
		} else if(day == 3) {
			System.out.println("오늘은 화요일");
		} else if(day == 4) {
			System.out.println("오늘은 수요일");
		} else if(day == 5) {
			System.out.println("오늘은 목요일");
		} else if(day == 6) {
			System.out.println("오늘은 금요일");
		} else if(day == 7) {
			System.out.println("오늘은 토요일");
		}

	}

}
