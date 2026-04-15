package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		//열거타입 변수선업
		Week today = null;
		
		//열거값 대입
		today  = Week.TUESDAY;
		
		
		
		// 컴퓨터의 요일 정보 얻기
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_WEEK);
		switch(day) {
		    case 1: today =Week.SUNDAY; break;
			case 2: today =Week.MONDAY; break;
			case 3: today =Week.TUESDAY; break;
			case 4: today =Week.WENEDAY; break;
			case 5: today =Week.THURSDAY; break;
			case 6: today =Week.FRIDAY; break;
			case 7: today =Week.SATURDAY; break;
				
		}
		
		//열거값 비교
				if(today == Week.SUNDAY) {
					System.out.println("오늘은 불안한 일요일.");
				} else if(today == Week.MONDAY){
					System.out.println("오늘은 우울한 월요일");
				} else if(today == Week.TUESDAY){
					System.out.println("오늘은 암울한 화요일");
				} else if(today == Week.WENEDAY){
					System.out.println("오늘은 체념한 수요일");
				} else if(today == Week.THURSDAY){
					System.out.println("오늘은 목빠지는 목요일");
				} else if(today == Week.FRIDAY){
					System.out.println("오늘은 불타는 금요일");
				} else if(today == Week.SATURDAY){
					System.out.println("오늘은 작살나는 토요일");
				}
			
		

	}

}
