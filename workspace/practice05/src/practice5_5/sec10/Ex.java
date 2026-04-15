package practice5_5.sec10;

public class Ex {

	public static void main(String[] args) {
		int[] arr = {10,20,30,30,40};
		
		int sum = 0;
		for(int i : arr) {
			
			sum += i;	
		}
		System.out.println(sum);
		System.out.println((double)sum/arr.length);
		
		String[] strArr = {"우","테","코"};
		
		String val  ="";
		
		for(String s : strArr) {
			val += s;		
		}
		System.out.println(val);
	}
}
