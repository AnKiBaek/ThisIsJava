package ch13.sec01.exam01;

public class GenericExample {
	public static void main(String[] args) {
		// T 는 Tv 타입으로 M 은 String 타입으로 결정 product1 변수로 객체화
		Product<Tv, String> product1 = new Product<>();
		
		//Setter 에서 Tv 객체와 , 문자열 리터럴 "AppleTv" 를 넣어준다. (박싱)
		product1.setKind(new Tv());
		product1.setModel("AppleTv");
		
		// 언박싱
		Tv tv =product1.getKind();
		String tvModel  = product1.getModel();
		
		// T 는 Tv 타입으로 M 은 String 타입으로 결정 product1 변수로 객체화
		Product<Car, String> product2 = new Product<>();
				
		//Setter 에서 Car 객체와 , 문자열 리터럴 "Bugatti" 를 넣어준다. (박싱)
		product2.setKind(new Car());
		product2.setModel("Bugatti");
				
		// 언박싱
		Car car =product2.getKind();
		String carModel  = product2.getModel();
				
		
	}
	
	
	
	
	

}
