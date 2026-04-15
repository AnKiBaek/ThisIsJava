package practice6_03.sec06.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		Phone phone = new Phone();
		Phone S23 = new Phone("S23",999999);
		
		
		//S23 객체 값 출력
		System.out.println("S23 객체 값 출력");
		System.out.println(S23.company); // company 값은 메서드 체이닝을 통해서 자동으로 들어갔다.
		System.out.println(S23.model);
		System.out.println(S23.price);
		
		System.out.println();
		
		//phone 객체 값 출력
		System.out.println("phone 객체 값 출력");
	    System.out.println(phone.company);
	    System.out.println(phone.model);
	    System.out.println(phone.price);
				

	}

}
