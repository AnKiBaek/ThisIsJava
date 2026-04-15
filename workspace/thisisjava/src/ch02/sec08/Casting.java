package ch02.sec08;

public class Casting {
	public static void main(String[] args) {
		
		// 강제 형변환 (캐스팅)
		
		// 문자형 | char   | 2byte  | 0~65535(유니코드) | "\n0000"
		// 정수형 | byte   | 1byte  | -127~127        | 0
		// 문자형 | short  | 2byte  | -32758~32757    | 0
		// 문자형 | int    | 4byte  | -21억 ~ 21억     | 0
		// 문자형 | long   | 8byte  | -42억 ~ 42억     | 0L
		// 실수형 | float  | 32byte | 상당히큼          | 0.0f
		// 실수형 | double | 64yte  | 상당히큼          | 0.0d
		// 논리형 | boolean| 1byte  | true , false    | false
		
		//int >>> byte 타입
		int var1 =10;
		byte var2 =  (byte) var1;
		System.out.println(var2);
		
		// long 타입 >>> int 타입
		long var3 =300;
		int var4 =(int)var3;
		System.out.println(var3);
		
		// int타입 >>>> char타입
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println("char: "+var6);
		
		//실수 타입 (double, float ) 은 정수타입 (byte,short,int,long) 보다 항상 큰값을 가진다.
		//정수형으로 캐스팅시  소수점 제외처리
		double var7 =3.14;
		int var8 = (int)var7;
		System.out.println(var8);
		
		
	}

}
