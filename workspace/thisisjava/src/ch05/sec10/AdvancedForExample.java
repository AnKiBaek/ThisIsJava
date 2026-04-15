 package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
		//인덱스가 필요없는경우에 쓴다.
		for(int score:scores) {
			sum = sum+score;
		}
		
		//합계
		System.out.println(sum);
		//평균
		System.out.println((double)sum/scores.length);
		
		String naame ="";
		String str1[] = {"안","기","백"};
		
		for(String name:str1) {
			naame =naame+ name ;
		}
		System.out.println(naame);

	}

}
