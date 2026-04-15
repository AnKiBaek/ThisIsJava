package practice5_1.sec04;

public class NullPointExceptionExample {
	


	public static void main(String[] args) {
		
		// 배열객체가 null 상태이다  (변수만있고 객체는 null)
		int[] intArr = null;
		
		//배열객체 자체가 null 인데 값을넣을수없다.
		intArr[0] =10;
		intArr[1] =20;
		
		for(int intVal : intArr) {
			System.out.println(intVal);
		}
		

		
		
		
		
		
		
		
		

	}

}
