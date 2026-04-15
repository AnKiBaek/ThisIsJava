package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		System.out.printf("%%\n");
		int value = 123;
		//기본
		System.out.printf("상품의가격:%d원\n",value);
		// 6: 자리 (기본적으로 앞쪽공백)
		System.out.printf("상품의가격:%6d원\n",value);
		// - : 뒤쪽 공백
		System.out.printf("상품의가격:%-6d원\n",value);
		// 0: 기본공백에 0채우기
		System.out.printf("상품의가격:%06d원\n",value);
		
		double area=3.1459 *10 *10;
		System.out.printf("반지름이%d인 원의 넓이:%10.2f\n",10,area);
		System.out.printf("반지름이%d인 원의 넓이:%10.1f\n",10,area);
		
		String name ="홍길동";
		String jop = "의적";
		
		System.out.printf("%06d | %-10s | %10s\n",1,name,jop);

	}

}
