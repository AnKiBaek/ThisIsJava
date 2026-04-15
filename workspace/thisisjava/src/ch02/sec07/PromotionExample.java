package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		int honr =3;
		int minte =5;
		System.out.println(honr+"시간"+minte+"분");
		
		int totalMinute =honr*60 + minte;
		
		System.out.println(totalMinute+"분");
		
		
				//byte >>>> int 자동 형변환 1바이트 >>>> 4바이트
		 		byte byteValue = 10;
				int intValue = byteValue;
				
				System.out.println("byteValue : "+intValue);
				
				//char >>> int 자동 형변환
				char charValue = '가';
				int intValue2 = charValue;
				
				System.out.println("가 의유니코드 : " + intValue2);
				
				// int <<<< long 자동 형변환
				int intValue3 =50;
				long longValue = intValue3;
				
				System.out.println("longValue : "+longValue);
				
				longValue = 100;
				
				float floatValue =longValue;
				
				System.out.println("floatValue : "+floatValue);
				
				//float >>> double 형변환
				floatValue =100.5F;
				double doubleValue =floatValue;
				
				System.out.println("doubleValue : "+doubleValue);

			}

}
